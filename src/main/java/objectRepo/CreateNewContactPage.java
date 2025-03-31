package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(id="title")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingCityTextField;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreateNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the firstNameTextField
	 */
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	/**
	 * @return the lastNameTextField
	 */
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	/**
	 * @return the titleTextField
	 */
	public WebElement getTitleTextField() {
		return titleTextField;
	}

	/**
	 * @return the emailTextField
	 */
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	/**
	 * @return the mobileTextField
	 */
	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	/**
	 * @return the mailingCityTextField
	 */
	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	/**
	 * @return the mailingStateTextField
	 */
	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	/**
	 * @return the mailingCountryTextField
	 */
	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a Business library to create new contact
	 * @param firstName
	 * @param lastName
	 * @param title
	 */
	public void createNewContact(String firstName, String lastName, String title)
	{
		getFirstNameTextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getSaveButton().click();
		
	}
	
	/**
	 * This is a Business library to create new contact
	 * @param lastName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 */
	public void createNewContact(String lastName, String email, String mobile, String mailingCity)
	{
		getLastNameTextField().sendKeys(lastName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingCityTextField().sendKeys(mailingCity);
		getSaveButton().click();
		
	}
	/**
	 * This is a Business library to create new contact
	 * @param lastName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContact(String lastName, String email, String mobile, String mailingCity, String mailingState, String mailingCountry)
	{
		getLastNameTextField().sendKeys(lastName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingStateTextField().sendKeys(mailingState);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
		
	}
	
}
