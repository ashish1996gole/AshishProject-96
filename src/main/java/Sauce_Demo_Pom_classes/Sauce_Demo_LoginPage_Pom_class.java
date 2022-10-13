package Sauce_Demo_Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_Demo_LoginPage_Pom_class 
{
	WebDriver driver;

	@FindBy(xpath="//input[@id='user-name']")
	WebElement Username;

	public void Send_Username_SauceDemo()
	{
		Username.sendKeys("standard_user");
	}
	public void Send_Invalid_Username_SauceDemo()
	{
		Username.sendKeys("standard");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;

	public void send_password_SauceDemo()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement LoginButton;

	public void click_LoginButton_SauceDemo()
	{
		LoginButton.click();
	}
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement ErrorMessage;

	public String get_ErrorMessage()
	{
		return ErrorMessage.getText();
	}
	public Sauce_Demo_LoginPage_Pom_class(WebDriver driver)

	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		}
}
