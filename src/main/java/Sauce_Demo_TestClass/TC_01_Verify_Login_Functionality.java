package Sauce_Demo_TestClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Sauce_Demo_Pom_classes.Sauce_Demo_LoginPage_Pom_class;

public class TC_01_Verify_Login_Functionality 
{
	WebDriver driver;
	@Test(invocationCount=1)
	public void Open_SauceDemoLOgin(TimeUnit Seconds)
	{
	System.setProperty("Webdriver.chrome.driver","C:\\selenium\\chromedriver_win32");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(20, Seconds);
	
	Sauce_Demo_LoginPage_Pom_class loginpage =new Sauce_Demo_LoginPage_Pom_class(driver);
	loginpage.Send_Username_SauceDemo();
	System.out.println("Enter Username");
	
	loginpage.send_password_SauceDemo();
	System.out.println("Enter password");
	
	loginpage.click_LoginButton_SauceDemo();
	System.out.println("click on Login Button");
	String givenTitle="Swag Labs";
	String ObtainTitle=driver.getTitle();
	Assert.assertEquals(givenTitle, ObtainTitle);
	}
	@Test
	public void INvalid_Credentials(TimeUnit Seconds)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(20,Seconds);
		
		Sauce_Demo_LoginPage_Pom_class loginpage =new Sauce_Demo_LoginPage_Pom_class(driver);
		loginpage.Send_Invalid_Username_SauceDemo();
		System.out.println("Enter InValid Username");
		
		loginpage.send_password_SauceDemo();
		System.out.println("Enter password");
		
		loginpage.click_LoginButton_SauceDemo();
		System.out.println("click on Login Button");
		String givenTitle1="Swag Labs";
		String ObtainTitle1=driver.getTitle();
		Assert.assertEquals(givenTitle1, ObtainTitle1);
		
	}
	
}
