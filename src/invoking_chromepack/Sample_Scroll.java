package invoking_chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Scroll {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");  
		  driver =new ChromeDriver();

		  driver.get("https://tollplus.agsindia.com/2.0/RetailerWeb/Default.aspx");
		  
		  driver.findElement(By.id("txtUserName")).click();

		  driver.findElement(By.id("txtUserName")).sendKeys("divyamsub");
		  
		  driver.findElement(By.id("txtPassword")).click();
		  driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
		  
		  driver.findElement(By.id("btnSignIn")).click();
		  
		 
		  driver.findElement(By.xpath("//a[text()=' Search']")).click();

		  driver.findElement(By.id("BodyContent_btnSearch")).click();

		  
		  
		  driver.findElement(By.id("BodyContent_txtAccountNumber")).sendKeys("11211592");
		  
		  driver.findElement(By.id("BodyContent_btnSearch")).click();
		  
		//   JavascriptExecutor js = ((JavascriptExecutor) driver);
		//
		//   WebElement element =driver.findElement(By.xpath("//a[text()='View Tag Account Summary']"));
//		       
		//   js.executeScript("0.scrollIntoView();",element);
		//   element.click();

		 driver.manage().window().maximize();
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
		 Thread.sleep(10000);

		 WebElement element =driver.findElement(By.xpath("//a[@title='More']"));
		 js.executeScript("arguments[0].scrollIntoView();",element);
		 Thread.sleep(5000);
		 element.click();
		  
		//   driver.manage().window().maximize();
		//   JavascriptExecutor js = (JavascriptExecutor) driver;
		//
		//  
//		         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


	}

}
