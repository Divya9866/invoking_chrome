package invoking_chromepack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab 
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			driver.manage().window().maximize();
			String s=driver.getWindowHandle();
			System.out.println("****** "+s);
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click(); 
			Thread.sleep(5000);
			
			
			ArrayList<String> tabs=new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
		//	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ "+tabs.get(0));
		
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Help']")).click();
			driver.switchTo().window(tabs.get(0));
		//	System.out.println("################################# "+tabs.get(0));
			
			Thread.sleep(5000);
			driver.close();		
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
