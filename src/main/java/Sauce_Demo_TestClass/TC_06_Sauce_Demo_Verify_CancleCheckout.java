package Sauce_Demo_TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Kite_Zerodha_Utility.Screenshot;

import Sauce_Demo_Pom_classes.Sauce_Demo_CheckOut_Page_Pom_classes;
import Sauce_Demo_Pom_classes.Sauce_Demo_Homepage_Pom_classes;

public class TC_06_Sauce_Demo_Verify_CancleCheckout extends Test_BAse_Class_SauceDemo
{	@Test
	public void Verify_checkout() throws IOException
	{
		Sauce_Demo_Homepage_Pom_classes home = new Sauce_Demo_Homepage_Pom_classes(driver);
		home.click_Bag1_AddtoCart();
	
		log.info("add one product in add to cart");
		home.click_CartButton();

		log.info("click on cart");
		Sauce_Demo_CheckOut_Page_Pom_classes cart = new Sauce_Demo_CheckOut_Page_Pom_classes(driver);
		cart.click_checkout_button();
;
		log.info("click on check out button");
		cart.send_FirstName_CheckOut_info();
;
		log.info("Enter First name");
		cart.send_LastName_CheckOut_info();
		
		log.info("Enter Last name");
		cart.send_PinCode_CheckOut_info();
		
		log.info("Enter Pincode");
		cart.click_continue_CheckOut_info();
		Screenshot.TakeScreenshot(driver, "Checkout_info_TC06");
		log.info("continue checkout");
		cart.click_cancle_CheckOut_overview_info();

		log.info("cancle checkout overview info");

}
}