package myTestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myclass 
{

	 @BeforeMethod
	    public void beforeMethod()
	    {
	    	System.out.println("before divya Method-banana");
	    }
	
	
	 @BeforeClass
	    public void beforeclass()
	    {
	    	System.out.println("before divya Class-apple");
	    }
    @BeforeTest
    public void beforeTest()
    {
    	System.out.println("before divya test-orange");
    }
	@Test
	public void logintobookmyshow()
	{
		System.out.println("This is divya book my show login ");
	}
	
	 @AfterMethod
	    public void afterMethod()
	    {
	    	System.out.println("after divya Method-chocolates");
	    }
	
	
	 @AfterClass
	    public void afterclass()
	    {
	    	System.out.println("after divya Class-icecream");
	    }
	 @AfterTest
	 public void afterTest()
	 {
 	System.out.println("after divya test-biryanis");
	 }
	
	
}
