package myTestNGPack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngbasic {
	
	@BeforeMethod
	public void firstmethod()
	{
		System.out.println("This is before method");
	}
	@Test(priority=2)
	public void secondmethod()
	{
		System.out.println("This is second method");
	}

	@Test(priority=1)
	public void thirdmethod()
	{
		System.out.println("This is Third method");
	}

	@Test(priority=3)
	public void fourthmethod()
	{
		System.out.println("This is fourth method");
	}


}
