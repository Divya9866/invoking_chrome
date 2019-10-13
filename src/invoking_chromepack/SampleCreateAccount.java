package invoking_chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleCreateAccount {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=20bb0cd67aa981cdd96eb1f1f9f4edce");
		driver.findElement(By.name("firstName")).click();
		driver.findElement(By.name("firstName")).sendKeys("sdsw");
		driver.findElement(By.name("lastName")).sendKeys("dsfsdfasdf");
		driver.findElement(By.name("phone")).sendKeys("9332222332");
		
		driver.findElement(By.name("userName")).sendKeys("abcde3@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Flat no 382,Hyderabad");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("987456");
		
		WebElement countries=driver.findElement(By.name("country"));
		Select country=new 	Select(countries);
		country.selectByIndex(3);

		
		driver.findElement(By.name("email")).sendKeys("gfdf");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Test@123");
		driver.findElement(By.name("register")).click();
		System.out.println("Clicked on Register button");
		WebElement element=(new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'SIGN-OFF')]")));		
		System.out.println("waiting for sighoff button");
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
		driver.quit();
		
		
		
		
	}

}
