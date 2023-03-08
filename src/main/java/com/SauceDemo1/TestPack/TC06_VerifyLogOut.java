package com.SauceDemo1.TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo1.POMPack.HomePagePOMClass;



public class TC06_VerifyLogOut extends TestBaseClass{
	@Test
	public void verifyLogOut()
	{
	


	HomePagePOMClass hp=new HomePagePOMClass(driver);
	hp.clickOptBtn();
	log.info("clicked on options");
	
	hp.clicklogout();
	log.info("clicked on logout");
	
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
	


}}
