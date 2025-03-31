package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass
{
	@Test(groups= {"Sanity","Regression"})
	public void Leads_002 () throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.clickLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnLeadsPageIcon();
		
		String fname = eUtil.getDataFromExcelFile("Leads", 5, 1);
		String lname= eUtil.getDataFromExcelFile("Leads", 5, 2);
		String company=eUtil.getDataFromExcelFile("Leads", 5, 3);
		String title = eUtil.getDataFromExcelFile("Leads", 5, 4);
		String mobile =eUtil.getDataFromExcelFile("Leads", 5, 5);
		String email = eUtil.getDataFromExcelFile("Leads", 5, 6);
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fname, lname, company, title, mobile, email);
	}
	
	@Test
	public void demo()
	{
		System.out.println("Hiiiii");
	}
}
