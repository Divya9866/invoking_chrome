package invoking_chromepack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles
{
	public static void main(String args[]) throws Exception
	{
		try {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver =new ChromeDriver();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		
		
		String P_window=driver.getWindowHandle();
		System.out.println("This is parentwindow "+P_window);
		driver.findElement(By.id("button1")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println("These are the windows "+it.next());
			String child_window=it.next();
			driver.switchTo().window(child_window);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/selenium-training/?q=HomePage']")).click();
			Thread.sleep(5000);
			driver.close();
			//	driver.switchTo().window(P_window);
		}
		}
		catch(Exception e) 
		{
			System.out.println("Exception is @@@@@@@@ "+e);
			throw e;
		}
	}

}
