package Sauce_Demo_Pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sauce_Demo_Homepage_Pom_classes 
{
	WebDriver driver;
	Select s;

	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement Main_Menu;

	public void click_Main_Menu()
	{
		Main_Menu.click();
	}
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout_sauceDemo;

	public void click_logoutButton_sauceDemo()
	{
		logout_sauceDemo.click();	
	}
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement Product_filter_dropDown;

	public void click_Product_filter_dropDown()
	{
		Product_filter_dropDown.click();
		s.selectByVisibleText("Price (high to low)");
		Product_filter_dropDown.isSelected();
	}
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement selectBag1;

	public void click_Bag1_AddtoCart()
	{
		selectBag1.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	 List<WebElement> AllbagAddto_cart;

	public void click_Add_Allbag_Addto_cart()
	{
		for(WebElement AllbagAddto_cart :  AllbagAddto_cart )
		AllbagAddto_cart.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart_Button;

	public String cart_Button_GetText()
	{
		String noofProduct =cart_Button.getText();
		return noofProduct;
	}
	
	public void click_CartButton()
	{
		cart_Button.click();
	}
	@FindBy(xpath="//a[text()='About']")
	WebElement About_sauce_demo;
	
	public void click_About_sauce_demo ()
	{
		About_sauce_demo.click();
	}
	@FindBy(xpath="//button[@id='react-burger-cross-btn']")
	WebElement Cancle_Button_MainMenu ;

	public void click_Cancle_Button_MainMenu()
	{
		Cancle_Button_MainMenu.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement Remove_FromCart ;
	
	public void click_Remove_FromCart()
	{
		Remove_FromCart.click();
	}
//	@FindBy(xpath="")
//	WebElement ;
//	
//	public void ()
//	{
//		
//	}
//	
//	
	
	
	
	
	public Sauce_Demo_Homepage_Pom_classes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		s=new Select(Product_filter_dropDown);
		
	}
	
	
	
}
