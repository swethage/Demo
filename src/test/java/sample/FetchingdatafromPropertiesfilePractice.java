package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingdatafromPropertiesfilePractice
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
	FileInputStream fs=new FileInputStream("C:\\Users\\geswe\\OneDrive\\Desktop\\Sample.properties");
	Properties p=new Properties();
	p.load(fs);
		String value=p.getProperty("url");
		String un=p.getProperty("username");
	String pwd=p.getProperty("password");
	System.out.println(value);
	driver.get(value);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un,Keys.TAB, pwd);
		
		
		
	}

}
