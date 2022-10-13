package Sauce_Demo_TestClass;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Sauce_Demo_Pom_classes.Sauce_Demo_Homepage_Pom_classes;
import Sauce_Demo_Pom_classes.Sauce_Demo_LoginPage_Pom_class;

public class Test_BAse_Class_SauceDemo 
{
	WebDriver driver;
	Logger log = Logger.getLogger("Sauce_Demo_Mavan");
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void Setup(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Driver_Folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./Driver_Folder\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		log.info("Browser is open");
		driver.get("https://www.saucedemo.com/");
	//	driver.manage().timeouts().implicitlyWait(20,Seconds);
		
		Sauce_Demo_LoginPage_Pom_class loginpage =new Sauce_Demo_LoginPage_Pom_class(driver);
		loginpage.Send_Username_SauceDemo();

		log.info("Enter Username");
		loginpage.send_password_SauceDemo();
	
		log.info("Enter password");
		loginpage.click_LoginButton_SauceDemo();
	
		log.info("click on Login Button");
		
	}
	@AfterMethod
	public void tearDown()
	{
		Sauce_Demo_Homepage_Pom_classes home = new Sauce_Demo_Homepage_Pom_classes(driver);
		home.click_Main_Menu();

		log.info("click on Main Menu");
		home.click_logoutButton_sauceDemo();
	
		log.info("click on LogOut Button");
		driver.quit();
		log.info("Closed Browser");
		
	}
	

}
