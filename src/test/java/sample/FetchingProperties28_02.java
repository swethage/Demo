package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingProperties28_02
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		PropertiesUtility p=new PropertiesUtility();
		String value=p.getDataFromPropertiesFile("url");
		driver.get(value);
		Thread.sleep(2000);
		String un=p.getDataFromPropertiesFile("username");
		String pwd=p.getDataFromPropertiesFile("password");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(un, Keys.TAB, pwd,Keys.ENTER );
		
		
	}
}
