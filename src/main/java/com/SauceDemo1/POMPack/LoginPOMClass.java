package com.SauceDemo1.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
//	1.WebDriver globally declared
      WebDriver driver;
      Actions act;
//      2.find web element by using ---annotation
     @FindBy(xpath="//*[@id='user-name']")
     WebElement username;
     
//     3.create method---method should be action name.ex---addition ,substration,sendusername
     public void sendusername()
     {
    	 username.sendKeys("standard_user");
     }
		
     @FindBy(xpath="//*[@id='password']")
     WebElement password;
     
     public void sendpassword()
     {
    	 password.sendKeys("secret_sauce");
    	 
    }
     
     @FindBy(xpath="//*[@id='login-button']")
     WebElement login;
     
     
     public void clicklogin()
     {
    	 act.click(login).perform();
    	
     }
//     4.create constructer
     public LoginPOMClass(WebDriver driver)
     {
    	 this.driver=driver;
    	 
    	 PageFactory.initElements(driver, this);
    	 act=new Actions(driver);
     }
		

	

}
