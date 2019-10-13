package invoking_chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).click();
		driver.findElement(By.id("identifierId")).sendKeys("9032006767");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678dfghj");
		
		Thread.sleep(10000);
		driver.quit();
	}

}
