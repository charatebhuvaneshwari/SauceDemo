package com.SauceDemo1.TestPack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.SauceDemo1.POMPack.HomePagePOMClass;
import com.SauceDemo1.POMPack.LoginPOMClass;
import com.SauceDemo1.UtilityPack.UtilityClass;




public class TestBaseClass  {
	
	WebDriver driver;
	Logger log =Logger.getLogger("SauceDemo_15Oct_Project");
	@BeforeMethod
		public void beforemethod() throws IOException
		{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\automation\\chromedriver_win32 (1)\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
			 LoginPOMClass lp=new LoginPOMClass(driver);
			lp.sendusername();
			log.info("username is entered");
			UtilityClass.screenshotmethod(driver, "usernamescreenshot");
			log.info("username screenshot is taken");
			lp.sendpassword();
			log.info("password entered");
			
			lp.clicklogin();
			log.info("clicked on loginBtn");
			UtilityClass.screenshotmethod(driver, "homepage screenshot");
			log.info("home page screenshot is taken");
			
			log.info("went to HomePage");
			}
		
			@AfterMethod
			public void tearDown()
			{
				HomePagePOMClass hp=new HomePagePOMClass(driver);
				hp.clickOptBtn();
				log.info("clicked on options");
				
				hp.clicklogout();
				log.info("clicked on logout");
				driver.quit();
				log.info("Browser is closed");
				log.info("End of Program");
			
			}
}
			
		
			
			

	
