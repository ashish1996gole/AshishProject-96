package com.Kite_Zerodha_Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class Screenshot 
{
	public static WebDriver driver;
	public static void TakeScreenshot(WebDriver driver,String x) throws IOException
	{
		
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("mm-dd-yy&hh-mm-ss");
		String date = d1.format(d);
		TakesScreenshot st =(TakesScreenshot)driver;
		File selefile=	st.getScreenshotAs(OutputType.FILE);
		File myself = new File("./Screenshot_Folder\\Sauce_Demo_Mavan"+x+date+".jpg");
		FileHandler.copy(selefile, myself);
}
	
//	public Screenshot(WebDriver driver)
//	{
//
//		this.driver = driver;
//		
//		PageFactory.initElements(driver,this);
//	}
}