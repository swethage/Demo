package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyNameTextField;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleOfTheEmployee;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceOptionDropDown;
		
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement countryNameTextField;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityNameTextField;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement  stateNameTextField;
	
	@FindBy(xpath="//input[@accesskey='S']")
	private WebElement saveButton;
	
	
	//Initialization
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		//Generating getters
	/*
	 * This is generic method is used to pass the firstName of Employee
	 */
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
		/**
		 * This is  method i used to pass the lastName
		 * @return
		 */

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	/**
	 * This is a generic method is used to pass the company name 
	 * @return
	 */

	public WebElement getCompanyNameTextField() {
		return companyNameTextField;
	}

	/**
	 * This is a generic method is used to pass the designation of the Employee
	 * @return
	 */
	
	public WebElement getTitleOfTheEmployee() {
		return titleOfTheEmployee;
	}
	/**
	 * This is a generic method is used to select the lead source of employee
	 * @return
	 */

	public WebElement getLeadSourceOptionDropDown() {
		return leadSourceOptionDropDown;
	}
	/**
	 * This is generic method  is used to pass the  no of employees
	 * @return
	 */
	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	/**
	 * This is generic method is used to pass the mobile Number 
	 * @return
	 */
	
	public WebElement getMobileNumberTextField() {
		return mobileNumberTextField;
	}
	/**
	 * This is generic method is used to pass the email text field
	 * @return
	 */

	public WebElement getEmailTextField() {
		return emailTextField;
	}
	/**
	 * This is a generic method is used to pass the country name  to the text Field
	 * @return
	 */
	public WebElement getCountryNameTextField() {
		return countryNameTextField;
	}

	/**
	 * This is the generic method is used to pass the city text field
	 * @return
	 */
	
	public WebElement getCityNameTextField() {
		return cityNameTextField;
	}

	/**
	 * This is a generic method is used to pass the state  text field 
	 * @return
	 */
	public WebElement getStateNameTextField() {
		return stateNameTextField;
	}
	/**
	 * This is generic method is used to save the details
	 * @return
	 */

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a business library  to create  new lead
	 * @param fName
	 * @param lName
	 * @param compay
	 */
	
	public void createNewLead(String fName, String lName, String company)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(company);
		getSaveButton().click();
	}
		/**
		 * This is business library to create new lead
		 * @param fName
		 * @param lName
		 * @param company
		 * @param title
		 * @param mobile
		 * @param email
		 */
	
	public void createNewLead(String fName, String lName, String company, String title, String mobile, String email  )
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(company);
		getTitleOfTheEmployee().sendKeys(title);
		getMobileNumberTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getSaveButton().click();

	}
		/**
		 * This is business to library to create a new lead
		 * @param lName
		 * @param company
		 * @param leadSource
		 * @param noOfEmployees
		 * @param city
		 * @param country
		 * @param state
		 */
	
	public void createNewLead(String lName, String company, String leadSource, String noOfEmployees, String city,String  country, String state )
	{
		getLastNameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(company);
		Select sel=new Select(getLeadSourceOptionDropDown());
		sel.selectByValue(leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getCityNameTextField().sendKeys(city);
		getCountryNameTextField().sendKeys(country);
		getStateNameTextField().sendKeys(state);
		getSaveButton().click();
	}

}
