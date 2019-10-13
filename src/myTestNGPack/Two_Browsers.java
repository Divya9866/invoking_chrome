package myTestNGPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Two_Browsers 
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
		 driver.findElement(By.xpath("//a[text()=' Search']")).click();
		 
		 
		 driver.findElement(By.xpath("//label[text()='Tag Account']")).click();
		 

		 
		 driver.findElement(By.id("BodyContent_txtCustomerNo")).sendKeys("21557407");
		 driver.findElement(By.id("BodyContent_btnCustSearch")).click();
		 
		 WebElement ManageAcc=driver.findElement(By.xpath("//a[text()='Manage Account']"));
		 Actions aa=new Actions(driver);
		 aa.moveToElement(ManageAcc).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()=' Assign Tag']")).click();
		 driver.findElement(By.xpath("//a[text()='Select']")).click();
		 
		driver.findElement(By.id("txtTagids")).sendKeys("150698767");

		 
		driver.findElement(By.id("btnFulfillRequest")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@id='lnkSignOut']")).click();
		 driver.close();
	}
	
	@Test(priority=2)
	public void divya() throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\geckodriver-v0.25.0-win64\\geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         
         driver.get("https://tollplus.agsindia.com/2.0/RetailerWeb/Default.aspx?ReturnUrl=%2f2.0%2fRETAILERWEB");
		 
		 driver.findElement(By.id("txtUserName")).click();

		 driver.findElement(By.id("txtUserName")).sendKeys("divyamsub");
		 
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
		 
		 driver.findElement(By.id("btnSignIn")).click();
		 driver.findElement(By.xpath("//a[text()=' Search']")).click();
		 
		 
		 driver.findElement(By.xpath("//label[text()='Tag Account']")).click(); 
		 driver.findElement(By.id("BodyContent_txtCustomerNo")).sendKeys("21557407");
		 driver.findElement(By.id("BodyContent_btnCustSearch")).click();
		 
		 Thread.sleep(3000);
		 WebElement payment=driver.findElement(By.xpath("//a[text()='Payments']"));
		 Actions aa=new Actions(driver);
		 aa.moveToElement(payment).perform();
		 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[text()=' Recharge Account']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("AllCheck")).click();
		  driver.findElement(By.id("txtSubAmount_0")).sendKeys("2000");
		  Thread.sleep(3000);
		  driver.findElement(By.id("btnSubmit")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("BodyContent_btnDoPayment")).click();
		  driver.findElement(By.xpath("//a[@id='lnkSignOut']")).click();
		  driver.close();
         
         
	}
}
