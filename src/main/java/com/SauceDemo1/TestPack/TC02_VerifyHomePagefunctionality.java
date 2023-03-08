package com.SauceDemo1.TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo1.POMPack.HomePagePOMClass;


public class TC02_VerifyHomePagefunctionality extends TestBaseClass {

	@Test
	public void verifyHomePagefunctionality()
	{
	

		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickOptBtn();
		log.info("clicked on options button");
		
		hp.clicklogout();
		log.info("clicked on logout button ");
		
		log.info("went to login page");
		log.info("apply verification");
		
		String expectedurl="https://www.saucedemo.com/";
		String actualurl=driver.getCurrentUrl();
		if(expectedurl==actualurl)
		{
			log.info("url Test case is passed");
		}
		else
		{
			log.info("url Test case is failed");
		}
		
		
		
	}

}
