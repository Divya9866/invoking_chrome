package myTestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myobject 
{
	
	@BeforeMethod
    public void beforeMethod()
    {
    	System.out.println("before kavya Method-sunflower");
    }


 @BeforeClass
    public void beforeclass()
    {
    	System.out.println("before kavya Class-rose");
    }
@BeforeTest
public void beforeTest()
{
	System.out.println("before kavya test-jasmine");
}
@Test
public void logintobookmyshow()
{
	System.out.println("This is kavya book my show login-lilly ");
}

 @AfterMethod
    public void afterMethod()
    {
    	System.out.println("after kavya Method-lotus");
    }


 @AfterClass
    public void afterclass()
    {
    	System.out.println("after kavya Class-alyssum");
    }
 @AfterTest
 public void afterTest()
 {
	System.out.println("after kavya test-amaryllis");
 }


}
