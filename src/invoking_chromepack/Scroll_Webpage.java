package invoking_chromepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Webpage 
{
	public static void main(String args[]) throws Exception 
	{
		try {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe"); 
		 driver =new ChromeDriver();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		 driver.manage().window().maximize();
	//	 Thread.sleep(5000);
		//js.executeScript("window.scrollBy(0,1000)");  //using pixels
		 
		 WebElement ele=driver.findElement(By.xpath("//h2[contains(text(),'Experience Gmail on any device')]"));
		 
	//	 js.executeScript("arguments[0].scrollIntoView();",ele); //scroll untill an element is visible
	//	 Thread.sleep(2000);
		// String s=ele.getText();
		// System.out.println("***************** "+s);
		 Thread.sleep(8000);
		 
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // scrolling completely to bottom of the page
		 
		}
		catch(Exception e) 
		{
			throw e;
		}

	}

}
