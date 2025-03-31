package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a login page POM class
 * @author geswe
 * @version
 */

public class LoginPage 
{
	// Locating WebElements
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

// Initializing WebElements
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Getter Methods
public WebElement getUsernameTextField() {
	return usernameTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getLoginButton() {
	return loginButton;
}

/** 
 * This is business library to perform login operation to application
 * @param username
 * @param password
 */
public void  loginToApplication(String username, String password)
{
	getUsernameTextField().sendKeys(username);
	getPasswordTextField().sendKeys(password);
	getLoginButton().click();
}
}
