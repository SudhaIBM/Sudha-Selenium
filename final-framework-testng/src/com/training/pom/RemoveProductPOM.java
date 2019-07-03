package com.training.pom;



import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductPOM 
{
private WebDriver driver; 
	
	public RemoveProductPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Donec suscipit']")
	private WebElement donec;
	
	public void clickDonec() throws InterruptedException
	{
		this.donec.click();
	}
		@FindBy(xpath="//button[.='Add to Cart']")
		private WebElement addCart;
		
		public void clickAdd()
		{
			this.addCart.click();
		}
		
		@FindBy(xpath="//i[@class='tb_icon ico-linea-ecommerce-bag']")
		private WebElement clickCart;
		
		public void clickCart()
		{
			this.clickCart.click();
		}
		
		@FindBy(xpath="//a[.='View Cart']")
		private WebElement viewCart;
		
		public void clickViewcart()
		{
			this.viewCart.click();
		}
		
		@FindBy(xpath="//i[@class='fa fa-times-circle']")
		private WebElement removeItem;
		
		public void clickRemove()
		{
			this.removeItem.click();
			driver.navigate().refresh();
		}
		
		
}

