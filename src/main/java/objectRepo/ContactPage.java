package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is a Contacts page POM class
 * @author geswe
 * @version 12.03.25
 */
		
public class ContactPage
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactsIcon;
	
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the createNewContactsIcon
	 */
	public WebElement getCreateNewContactsIcon() {
		return createNewContactsIcon;
	}
	
	/**
	 * This is a business library to click create new contact icon
	 */
	
	public void clickonCreatingNewContactIcon()
	{
		getCreateNewContactsIcon().click();
	}
}
