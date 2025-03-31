package sample;

import org.testng.annotations.Test;

public class TestNGAttributes 
{
	@Test(priority=2, invocationCount=0)
	public void createUser()
	{
		System.out.println("User Created");
	}
	
	@Test(priority=-1,dependsOnMethods= {"createUser"})
	public void modifyUser()
	{
		System.out.println("User Modified");
	}

	@Test(enabled=false)
	public void deleteUser()
	{
		System.out.println("User Deleted");
	}
	
	@Test(priority=5)
	public void alterUser()
	{
		System.out.println("User Altered");
	}

}
