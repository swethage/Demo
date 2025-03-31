package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage
{
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadsIcon;
		/**
		 * This is generic method is used to initialize webElements
		 * @param driver
		 */
		public LeadsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		//Generating getters
		/**
		 * This is generic method is used to  getter method
		 * @return
		 */

		public WebElement getCreateNewLeadsIcon() {
			return createNewLeadsIcon;
		}
		/**
		 * This is a business method is used to create new Leads page
		 */
		public void clickOnLeadsPageIcon()
		{
			getCreateNewLeadsIcon().click();
		}


}
