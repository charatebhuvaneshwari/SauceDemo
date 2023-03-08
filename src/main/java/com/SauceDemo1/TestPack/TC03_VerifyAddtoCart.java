package com.SauceDemo1.TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo1.POMPack.HomePagePOMClass;



public class TC03_VerifyAddtoCart extends TestBaseClass {
	@Test
	public void verifyAddtoCart()
	
	{

		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp. clickaddtocartBtn();
		log.info("clicked on bag product add to cart button");
		
		String expectedproduct="1";
		String actualproductselected=hp.gettextfromaddtocart();
		if(expectedproduct.equals(actualproductselected))
		{
			log.info("Test case is passed");
		}
		else
		{
			log.info("Test case is failed");
		}
		
		
		
	
		

	}

}
