package Sauce_Demo_TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Kite_Zerodha_Utility.Screenshot;

import Sauce_Demo_Pom_classes.Sauce_Demo_Homepage_Pom_classes;

public class TC_04_Sauce_Demo_Verify_Products_ADDTOCART extends Test_BAse_Class_SauceDemo
 { 
	@Test
	public void Verify_SingleProduct_ADDTOCART () throws IOException 
	{

	Sauce_Demo_Homepage_Pom_classes home = new Sauce_Demo_Homepage_Pom_classes(driver);
	home.click_Bag1_AddtoCart();
	
	log.info("add one product in add to cart");
	String Actual=home.cart_Button_GetText();
	String given = "1";
	Assert.assertEquals(Actual, given);
	Screenshot.TakeScreenshot(driver, "AddtoCart");
	log.info("apply validation");
	}
	

}