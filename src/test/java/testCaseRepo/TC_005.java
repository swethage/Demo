package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreateNewContactPage;
import objectRepo.HomePage;

public class TC_005 extends BaseClass
{
	@Test 
	public void Con_001() throws EncryptedDocumentException, IOException
	{
		HomePage hp= new HomePage(driver);
		hp.clickOnContactMenu();
		
		ContactPage cp= new ContactPage(driver);
		cp.clickonCreatingNewContactIcon();
		
		String lname= eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String email= eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String mobile= eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String mailingCity= eUtil.getDataFromExcelFile("Contacts", 5, 4);
		CreateNewContactPage cncp= new CreateNewContactPage(driver);
		cncp.createNewContact(lname, email, mobile, mailingCity);
	}
}
