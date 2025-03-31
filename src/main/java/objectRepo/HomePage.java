package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="//a[text()='Leads' and @ href='index.php?module=Leads&action=index']")
	private WebElement leadsName;

	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactName;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutOption;

	/**
	 * This is a generic method to initialize 
	 * @param driver
	 */
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//generating Getters 
	public WebElement getLeadsName() 
	{
		return leadsName;
	}

	public WebElement getContactName() 
	{
		return contactName;
	}

	public WebElement getAccountsIcon()
	{
		return accountsIcon;
	}

	public WebElement getSignOutOption()
	{
		return signOutOption;
	}
	/**
	 * This is a business library which clicks on Leads menu
	 */

	public void clickLeadsMenu()
	{
		getLeadsName().click();
	}
	/**
	 * This is a business library  which clicks on Contacts menu
	 */

	public void  clickOnContactMenu()
	{
		getContactName().click();
	}

	/**
	 * This is a business library to perform sign our operation
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
			Actions act = new Actions(driver);
			act.moveToElement(getAccountsIcon()).perform();
			getSignOutOption().click();
	}


}
