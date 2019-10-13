package invoking_chromepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class gmail {
	
	
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='firstName']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("divya");
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


	driver.findElement(By.id("lastName")).click();
	driver.findElement(By.id("lastName")).sendKeys("reddy");
	
	
	driver.findElement(By.name("Username")).click();
	driver.findElement(By.name("Username")).sendKeys("divyareddytummala197@gmail.com");
	
	driver.findElement(By.name("Passwd")).click();
	driver.findElement(By.name("Passwd")).sendKeys("Test@123");
	
	driver.findElement(By.name("ConfirmPasswd")).click();
	driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test@123");
	
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	
	}
	
	

	

}
