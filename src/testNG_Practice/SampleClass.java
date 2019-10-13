package testNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleClass 
{
	
	@BeforeClass
	public void after_Test() 
	{
		System.out.println("This is before class block");
	}
	
	@Test
	public void Divya_Details() 
	{
		System.out.println("This is testng method and this is test block");
	}
	
	

	@AfterClass
	public  void before_Test() 
	{
		System.out.println("This is After class block");
	}
	
	
	

}
