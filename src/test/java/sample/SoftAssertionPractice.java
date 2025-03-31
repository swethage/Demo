package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice
{
	@Test
	public void strictLevelComparision()
	{
		String expectedName="Binod";
		String actualName="Bino";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualName, expectedName);
		s.assertTrue(actualName.equals(expectedName));
		System.out.println("Soft asertion strict level completed");
		s.assertAll();
	}
	
	@Test
	public void containsLevelComparision()
	{
		String a1="help";
		String a2="hello";
		SoftAssert s=new SoftAssert();
		s.assertEquals(a2.contains(a1),true);
		s.assertAll();
		System.out.println("Soft asertion contains level completed");
		
	}
}
