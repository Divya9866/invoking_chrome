package myTestNGPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchAccount 
{
	WebDriver driver;
	@Test(priority=2,dependsOnMethods="login",timeOut=3000)
	public void SearchCustomer() 
	{
		
		System.setProperty("", "");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=' Search']")).click();
	
		 
		 driver.findElement(By.xpath("//label[text()='Tag Account']")).click();
		 
		 
		 driver.findElement(By.id("BodyContent_txtCustomerNo")).sendKeys("21557417");
		 driver.findElement(By.id("BodyContent_btnCustSearch")).click();
		
	}
}
