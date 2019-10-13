package myTestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		
		 driver =new ChromeDriver();
		 driver.get("https://tollplus.agsindia.com/2.0/RetailerWeb/Default.aspx?ReturnUrl=%2f2.0%2fRETAILERWEB");
		 
		 driver.findElement(By.id("txtUserName")).click();

		 driver.findElement(By.id("txtUserName")).sendKeys("divyamsub");
		 
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
		 
		 driver.findElement(By.id("btnSignIn")).click();
}
}