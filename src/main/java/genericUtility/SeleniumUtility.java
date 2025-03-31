package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
	/**
	 * This is a generic method to access a Web Application
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver,String url) 
	{
		driver.get(url);
		
	}
	/**
	 * This is a generic method to maximize the Browser
	 * @param driver
	 */
	public void maximizedWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This is a generic method to provide  the implicit wait
	 * @param driver
	 * @param maxTime
	 */
	
	public void implicitWait(WebDriver driver,int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	
	
	//////////////////////////Mouse Actions/////////////////////////////////////
	
	/**
	 * This is a generic method to scroll the webPage to webElement
	 * @param driver
	 * @param element
	 */
	public void scrollingOperation(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	/**
	 * This is generic method to perform mouse hovering action on a webElement
	 * @param driver
	 * @param element
	 */
	public void mouseOvering(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	/**
	 * This is a generic method to perform to double click operation on a webElement
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	//////////////////////////////Handling Alert////////////////////
	
	
	/**
	 * This is generic  method to perform to accept the alert popUp
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is generic method to perform to cancel the alert popUp
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

	
	/**
	 * This is a generic method to get the alert popUp Message
	 * @param driver
	 * @return
	 */
		public String getAlertMessage(WebDriver driver )
	{
		String message=driver.switchTo().alert().getText();
		return  message;
	}
	/**
	 * This is a generic method to pass the value to the alert popUp
	 * @param driver
	 * @param value
	 */
	public void sendValueToAlert(WebDriver driver, String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
/////////////////////////Handling DropDopwn////////////////
	
/**
* This is a generic method to select an option in dropDown using its index
* @param element
* @param index
*/	
public void  selectOptionByIndex(WebElement element,int index)
{
Select sel=new Select(element);
sel.selectByIndex(index);
}

/**
* This is a generic method to select an option in dropDown using its Value attribute
* @param element
* @param value
*/
public void  selectOptionByValue(WebElement element,String value)
{
Select sel=new Select(element);
sel.selectByValue(value);
}
/**
 * This is a generic method is select an option in dropDown using its visible Text
 * @param element
 * @param visible
 */
public void  selectOptionByVisibleText(WebElement element,String visibleText)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(visibleText);
}

//////////////////////////Taking ScreenShots/////////////////////


public String getTakeScreenshot(WebDriver driver,String dateTimeStamp) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\Eclipse Programmes\\com.vtiger.section3\\Screenshots\\image- +"+dateTimeStamp+".png");
	Files.copy(src, dest);
	return dest.getAbsolutePath();			//For Listeners
	

}
	

}
