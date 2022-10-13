package Sauce_Demo_TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Kite_Zerodha_Utility.Screenshot;

import Sauce_Demo_Pom_classes.Sauce_Demo_Homepage_Pom_classes;

public class TC_03_Sauce_Demo_Verify_FilterButton extends Test_BAse_Class_SauceDemo
{
	
	@Test
	public void _Verify_FilterButton() throws IOException 
	{
		Sauce_Demo_Homepage_Pom_classes home = new Sauce_Demo_Homepage_Pom_classes(driver);
	home.click_Product_filter_dropDown();
	Screenshot.TakeScreenshot(driver, "Filterbutton");
	log.info("click on filter button");

	}

}
