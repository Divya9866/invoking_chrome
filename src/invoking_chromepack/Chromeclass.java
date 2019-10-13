package invoking_chromepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chromeclass {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://www.facebook.com");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thummala");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9874561232");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Divya@123");
		
		WebElement days=driver.findElement(By.id("day"));
		Select day=new Select(days);
		day.selectByVisibleText("10");
		
		
		WebElement months=driver.findElement(By.id("month"));
		Select month=new Select(months);
		//month.selectByIndex(3);
		month.selectByValue("5");
		
		WebElement years=driver.findElement(By.id("year"));
		Select year=new Select(years);
		year.selectByVisibleText("1993");
		//driver.quit();
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		WebElement element=(new WebDriverWait(driver, 50)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='reg_passwd__']")));


		
	}

}
