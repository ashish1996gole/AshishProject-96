package Sauce_Demo_TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Kite_Zerodha_Utility.Screenshot;

public class TC_02_Sauce_Demo_Verify_Login_Functionality extends Test_BAse_Class_SauceDemo
{
	@Test
	public void Verify_Login_Functionality() throws IOException
	{
		String givenTitle1="Swag Labs";
		String ObtainTitle1=driver.getTitle();
		log.info("Get Actual Title");
		Assert.assertEquals(givenTitle1, ObtainTitle1);
		Screenshot.TakeScreenshot(driver, "Loginpage");
		
	}
	
	
}
