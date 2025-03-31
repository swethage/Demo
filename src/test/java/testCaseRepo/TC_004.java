package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreateNewContactPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass
{
	@Test (groups= {"Smoke","Regression"})
	public void Con_001() throws EncryptedDocumentException, IOException
	{
		HomePage hp= new HomePage(driver);
		hp.clickOnContactMenu();
		
		ContactPage cp= new ContactPage(driver);
		cp.clickonCreatingNewContactIcon();
		
		String fname= eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String lname= eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String title= eUtil.getDataFromExcelFile("Contacts", 2, 3);
		CreateNewContactPage cncp= new CreateNewContactPage(driver);
		cncp.createNewContact(fname, lname, title);
	}
}
