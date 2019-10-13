package testNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 
{
	
	@BeforeMethod
	public void beforeTest() 
	{
		try 
		{
			System.out.println("This is before method block");
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Test
	public void vinay_Details() 
	{
		try 
		{
			System.out.println("This is Test block");
		
		}
	 catch(Exception e) 
		{
		
		}
	}
	
	
	@AfterMethod
	public void afterTest() 
	{
		try 
		{
			System.out.println("This is After Method block");
		}
		catch(Exception e) 
		{
			
		}
		
	}

}
