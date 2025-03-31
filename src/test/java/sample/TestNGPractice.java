package sample;

import org.testng.annotations.Test;

public class TestNGPractice
{
	@Test(priority=2)
	public void createUser()
	{
		System.out.println("User Created");
	}
	
	@Test(priority=-1,dependsOnMethods= {"alterUser"})
	public void modifyUser()
	{
		System.out.println("User Modified");
	}

	@Test
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
