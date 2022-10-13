package Sauce_Demo_Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sauce_Demo_CheckOut_Page_Pom_classes 
{
	WebDriver driver;

	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement Remove_product_continue_shopping ;

	public void click_Remove_product_continue_shopping ()
	{
		Remove_product_continue_shopping.click();
	}
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout ;
	
	public void click_checkout_button ()
	{
		checkout.click();
	}
	@FindBy(xpath="//input[@id='first-name']")
	WebElement FirstName_CheckOut_info ;
	
	public void send_FirstName_CheckOut_info ()
	{
		FirstName_CheckOut_info.sendKeys("Ashish");
	}
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LastName_CheckOut_info ;
	
	public void send_LastName_CheckOut_info()
	{
		LastName_CheckOut_info.sendKeys("Gole");
	}
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement PinCode_CheckOut_info;
	
	public void send_PinCode_CheckOut_info()
	{
		PinCode_CheckOut_info.sendKeys("1452525");
	}
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_CheckOut_info;
	
	public void click_continue_CheckOut_info()
	{
		continue_CheckOut_info.click();
	}
	@FindBy(xpath="//button[@id='cancel']")
	WebElement cancle_CheckOut_info ;
	
	public void click_cancle_CheckOut_info()
	{
		cancle_CheckOut_info.click();
	}
	@FindBy(xpath="//button[@id='finish']")
	WebElement finish_CheckOut_info;
	
	public void click_finish_CheckOut_overview_info()
	{
		finish_CheckOut_info.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement cancle_CheckOut_overview_info ;
	
	public void click_cancle_CheckOut_overview_info()
	{
		cancle_CheckOut_overview_info.click();
	}
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement BackHome;
	
	public void click_BackHome_CheckOut_overview_info()
	{
		BackHome.click();
	}
//	@FindBy(xpath="")
//	WebElement ;
//	
//	public void ()
//	{
//		
//	}
	
	
	
	public Sauce_Demo_CheckOut_Page_Pom_classes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
}
