package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	//public static WebDriver sDriver;
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertiesUtility pUtil= new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	//for making WebDriver reference variable as thread safe
	public static ThreadLocal<WebDriver> driverInstance = new ThreadLocal<>();
	
	@BeforeSuite(alwaysRun= true)
	public void dbConnection()
	{
		System.out.println("DB Connection created");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional ("chrome") String BROWSER) throws Exception
	{	
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else
		{
			driver=new ChromeDriver();
		}
		//sDriver=driver;			//Initializing static driver for listener
		//Used in listeners for screenshot for making driver as thread safe oin parallel execution
		setDriver(driver);
		sUtil.maximizedWindow(driver);
		sUtil.implicitWait(driver, 15);
		System.out.println("Browser launched successfully");
		
		String URL= pUtil.getDataFromPropertiesFile("url");
		sUtil.navigateToApplication(driver, URL);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
		String UN =pUtil.getDataFromPropertiesFile("username");
		String PWD=pUtil.getDataFromPropertiesFile("password");
		LoginPage lp= new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutOperation()
	{
		HomePage hp=new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("Logout done successfully");
	}
	
	@AfterClass(alwaysRun= true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDBConnection()
	{
		System.out.println("DB Connection closed");
	}
	
	////Sets the current thread's copy of this thread-local variable to the specified value
	public static void setDriver(WebDriver driver)
	{
		driverInstance.set(driver);
	}
	
	//Returns the value in the current thread's copy of this thread-local variable
	public static WebDriver getDriver()
	{
		return driverInstance.get();
	}
	
}
