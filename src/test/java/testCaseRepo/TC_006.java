package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreateNewContactPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass
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
		String mailingState= eUtil.getDataFromExcelFile("Contacts", 5, 5);
		String mailingCountry= eUtil.getDataFromExcelFile("Contacts", 5, 6);
		CreateNewContactPage cncp= new CreateNewContactPage(driver);
		
	}
}
