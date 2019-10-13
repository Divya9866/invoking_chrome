package testNG_Practice;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Depends_Testng
{
	
	
//	driver=new ChromeDriver();
	
	@Test(invocationCount=3)
	public void firstMethod() 
	{
		
		int a=1,b=0,c;
		c=b/a;
		System.out.println("this is first method");
		
	}
	
	@Test (dependsOnMethods="firstMethod",enabled=false,timeOut=5000) 
	public void SecondMethod() 
	{
		int a=10,b=20,c;
	
		c=a+b;
		System.out.println("This is second mehtod");
		
	}
	
	@Test
	public void ThirdMethod() 
	{
		System.out.println("This is third method");
	}
	

	
}
