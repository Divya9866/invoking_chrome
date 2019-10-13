package invoking_chromepack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Createaccount {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dtummala.SUREITIND\\Desktop\\New sw\\Chrome\\chromedriver.exe"); 
		 driver =new ChromeDriver();

		 driver.get("https://tollplus.agsindia.com/2.0/RetailerWeb/Default.aspx?ReturnUrl=%2f2.0%2fRETAILERWEB");
		 
		 driver.findElement(By.id("txtUserName")).click();

		 driver.findElement(By.id("txtUserName")).sendKeys("divyamsub");
		 
		 driver.findElement(By.id("txtPassword")).click();
		 driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
		 
		 driver.findElement(By.id("btnSignIn")).click();
		 

		 driver.findElement(By.xpath("//a[text()=' Search']")).click();
		 
		 
		 driver.findElement(By.xpath("//label[text()='Tag Account']")).click();
		 

		 
		 driver.findElement(By.id("BodyContent_txtCustomerNo")).sendKeys("21557420");
		 driver.findElement(By.id("BodyContent_btnCustSearch")).click();

		 
		 
		 WebElement ManageAcc=driver.findElement(By.xpath("//a[text()='Manage Account']"));
		 Actions aa=new Actions(driver);
		 aa.moveToElement(ManageAcc).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()=' Assign Tag']")).click();
		 driver.findElement(By.xpath("//a[text()='Select']")).click();
		 
		driver.findElement(By.id("txtTagids")).sendKeys("150698762");

		 
		driver.findElement(By.id("btnFulfillRequest")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//alert.accept();
		String d=alert.getText();
		//alert.dismiss();

		System.out.println("*********** "+d);

	}

}
