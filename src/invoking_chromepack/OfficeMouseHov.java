package invoking_chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OfficeMouseHov {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://tollplus.agsindia.com/2.0/RetailerWeb/Default.aspx");	
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.id("txtUserName")).sendKeys("divyamsub");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
		
		driver.findElement(By.id("btnSignIn")).click();

		Thread.sleep(5000);
	    Actions aa=new Actions(driver);
	    WebElement ee=driver.findElement(By.xpath("//a[text()='Accounts']"));
	    aa.moveToElement(ee).perform();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()=' Create New Account']")).click();
	    
	    WebElement drpdown=driver.findElement(By.id("ddlIDProof"));
	    
	    for(int i=1;i<=31;i++) 
	    {
	    	 driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr[1]//td[1]/a[contains(text(),'i')]")).click();
	    	
	    }

	}

}
