package Sauce_Demo_TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Kite_Zerodha_Utility.Screenshot;

import Sauce_Demo_Pom_classes.Sauce_Demo_Homepage_Pom_classes;

public class TC_08_Sauce_demo_AddAll_product_cart extends Test_BAse_Class_SauceDemo
{
	@Test
	public void Verify_MultipleProduct_ADDTOCART () throws IOException 
	{
		Sauce_Demo_Homepage_Pom_classes home = new Sauce_Demo_Homepage_Pom_classes(driver);	
		
		home.click_Add_Allbag_Addto_cart();
		log.info("Add all products in cart");
		
		Screenshot.TakeScreenshot(driver, "AllProduct_AddtoCArt");
		String Actual=home.cart_Button_GetText();
		String given = "6";
		Assert.assertEquals(Actual, given);
		log.info("Apply validation");
	
	}
}
