package invoking_chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com");	
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		
		
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Electronics']"));
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi']")).click();
		
		
		
	}

	
	
}
