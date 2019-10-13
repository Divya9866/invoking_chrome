package testNG_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionFlow_Testng 
{
	
	
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("This is before Test");
	}
	
	/*
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("This is before class"); }
	 * 
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("This is before Method"); }
	 */
	
	@Test
	public void Execution() 
	{
		
		int a=10,b=5,c;
		c=a+b;
		System.out.println("@@@@@@@@@@@@@ "+ c);
	}
	
	/*
	 * @AfterMethod public void afterMethod() {
	 * System.out.println("This is after method"); }
	 * 
	 * @org.testng.annotations.AfterClass public void AfterClass() {
	 * System.out.println("This is after class"); }
	 */
	
	@org.testng.annotations.AfterTest
	public void AfterTest() 
	{
		System.out.println("This is after Test");
	}

}
