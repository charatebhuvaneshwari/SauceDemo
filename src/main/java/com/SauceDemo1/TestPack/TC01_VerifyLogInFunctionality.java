package com.SauceDemo1.TestPack;



import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class TC01_VerifyLogInFunctionality extends TestBaseClass{
	
    @Test
	public void  verifylogInfunctionality() throws IOException
	{
		
		
		log.info("apply verification");
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			log.info("Test case is passed");
		}
		else
		{
			log.info("Test is failed");
		}
		
	

	

	}

}
