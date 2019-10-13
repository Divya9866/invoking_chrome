package invoking_chromepack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weblinks_Verification {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver;
		HttpURLConnection hc=null;
		
		String Url="https://www.facebook.com/logi/identify/?";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\Desktop\\Selenium_SW\\chromedriver_win32_1\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		hc=(HttpURLConnection)(new URL(Url).openConnection());
		hc.connect();
		int Responsecode=hc.getResponseCode();
		System.out.println("Response code is: "+Responsecode);
		String ResponseMSG=hc.getResponseMessage();
		System.out.println("Response Message is: "+ResponseMSG);
		if(Responsecode!=200) 
		{
			System.out.println("Link is broken "+Url);
		}
		else
		{
			System.out.println("Link is working fine");
		}
		
		ArrayList<String> li=new ArrayList<String>();
		
		li.add(0,"https://www.facebook.com/logi/identify/?");
		li.add(1,"https://www.google.com");
		
		Iterator<String> iterator = li.iterator();
		while(iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
		

	}

}
