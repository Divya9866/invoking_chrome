package testNG_Practice;

import org.testng.annotations.Test;

public class Priority 
{
	
	@Test (priority=1)
	public void Login() 
	{
		System.out.println("This is Login");
	}
	
	@Test (priority=2)
	public void sendRequest() 
	{
		System.out.println("This Send Request");
	}
	
	@Test (priority=3)
	public void Logout() 
	{
		System.out.println("This is Logout");
	}

}
