package com.SauceDemo1.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass {
	
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//*[@id='react-burger-menu-btn']")
	private WebElement clickOptBtn ;
	public void clickOptBtn() 
	{
		clickOptBtn.click();
	}
	
	@FindBy(xpath="//*[@id='logout_sidebar_link']")
	private WebElement logout;
	public void clicklogout() 
	{
		logout.click();
	}
	
	@FindBy(xpath="//*[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocart;
	public void clickaddtocartBtn()
	{
		addtocart.click();
	}
	
	@FindBy(xpath="//*[@class='shopping_cart_badge']")
	private WebElement cartbutton;
	public String gettextfromaddtocart()
	{
		return cartbutton.getText();
		
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProducts;
//	public void clickallProducts()
//	{
//		for(WebElement j :allProducts)
//		{
//			 j.containsAll(allProducts);
//		}
//	}
	//allPrdtAddToCart
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement> addAllPrdt;
		
		public void clickaddAllPrdt()
		{
			for(WebElement x:addAllPrdt)
			{
				x.click();
			}
			
		}

	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement j;
	public String gettextfromcartbutton()
	{
		return j.getText();
	}

	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	public void clickdropdown()
	{
		dropdown.click();
	
 
	s.selectByValue("za");
	}
	
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		s=new Select(dropdown);
	}

	public void clickallProducts() {
		// TODO Auto-generated method stub
		
	}

	

	

}
