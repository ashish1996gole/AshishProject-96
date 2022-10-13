package Sauce_Demo_TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Kite_Zerodha_Utility.Screenshot;

import Sauce_Demo_Pom_classes.Sauce_Demo_CheckOut_Page_Pom_classes;
import Sauce_Demo_Pom_classes.Sauce_Demo_Homepage_Pom_classes;

public class TC_07_Sauce_Demo_Verify_RemoveProduct_CArt extends Test_BAse_Class_SauceDemo
{
	@Test
	public void Verify_RemoveProduct_CArt() throws IOException
	{
	    Sauce_Demo_Homepage_Pom_classes home = new Sauce_Demo_Homepage_Pom_classes(driver);
		home.click_Bag1_AddtoCart();

		log.info("add one product in add to cart");
		home.click_CartButton();
		log.info("click on cart button");
		Screenshot.TakeScreenshot(driver, "Cart_info");
		home.click_Remove_FromCart();
		log.info("click on remove product from cart");
		Sauce_Demo_CheckOut_Page_Pom_classes cart =new Sauce_Demo_CheckOut_Page_Pom_classes(driver);
		cart.click_Remove_product_continue_shopping();

		log.info("click on continue shopping");
		String givenTitle1="Swag Labs";
		String ObtainTitle1=driver.getTitle();
		log.info("Get the title of page");
		Assert.assertEquals(givenTitle1, ObtainTitle1);
		log.info("Apply the validation");
		String CountCart=home.cart_Button_GetText();
		String CountCArtgiven = "";
		Assert.assertEquals(CountCart, CountCArtgiven);
		log.info("Apply the vALIDATION");
		Screenshot.TakeScreenshot(driver, "TC07_info");


		
}
}