package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPlaceOrd_AdminChangeStatusPOM 
{

private WebDriver driver; 
	
	public UserPlaceOrd_AdminChangeStatusPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
/*   @FindBy(xpath="//a[@id='search_button']")
	private WebElement searchBtn;
	
	public void clickSearchBtn() throws InterruptedException
	{
		this.searchBtn.click();
	}
	
	@FindBy(xpath="//input[@id='filter_keyword']")
	private WebElement search;


	
	public void sendItemtoSearch(String search) 
	{
				this.search.clear();
				this.search.sendKeys(search,Keys.ENTER);
	} */
	
	
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
		
			
		@FindBy(xpath="//span[@class='tb_items']")
		private WebElement cart;
		
		public void mouseOverCart() throws InterruptedException
		{
			Actions action = new Actions(driver);
			System.out.println("cart");
			action.moveToElement(cart).build().perform();
			
		}
		
		@FindBy(xpath="//a[.='View Cart']")
		private WebElement viewCart;
		
		public void clickViewCart()
		{
			Actions action = new Actions(driver);
			System.out.println("view cart");
			action.moveToElement(this.viewCart).click().build().perform();
			//this.viewCart.click();
		} 
		
		@FindBy(xpath="(//a[.='Checkout'])[2]")
		private WebElement checkoutBtn;
		
		public void clickcheckoutBtn()
		{
			this.checkoutBtn.click();
		} 
		
		@FindBy(xpath="//input[@value='register']")
		private WebElement registerBtn;
		
		public void clickRegisterBtn()
		{
			this.registerBtn.click();
		} 
		
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement email;

		public void sendEmail(String email) 
		{			this.email.clear();
					this.email.sendKeys(email);
					
		}
		
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement password;

		public void sendPassword(String password) 
		{			this.password.clear();
					this.password.sendKeys(password);
					
		}
		
		
		@FindBy(xpath="//input[@id='button-account']")
		private WebElement continueBtn;
		
		public void clickContinueBtn()
		{
			this.continueBtn.click();
		} 
		
		@FindBy(xpath="//input [@value='guest']")
		private WebElement guestRadioBtn;
		
		public void clickGuestRadioBtn()
		{
			this.guestRadioBtn.click();
		} 
		
		@FindBy(xpath="//input[@id='button-account']")
		private WebElement cntnueBtn;
		
		public void clickCntnueBtn()
		{
			this.cntnueBtn.click();
		} 
		
		/*@FindBy(xpath="//input[@name='email']")
		private WebElement email;

		public void sendEmail() 
		{			this.email.clear();
					this.email.sendKeys("abc@test.com");
					
		} */
		
		@FindBy(xpath="//input[@name='telephone']")
		private WebElement telephone;

		public void sendTelephone() 
		{			this.telephone.clear();
					this.telephone.sendKeys("7534534530");
					
		}
		
		@FindBy(xpath="//input[@name='address_1']")
		private WebElement address1;

		public void sendAddress1() 
		{			this.address1.clear();
					this.address1.sendKeys("Bangalore");
					
		}
		
		@FindBy(xpath="//input[@name='city']")
		private WebElement city;

		public void sendCity() 
		{			this.city.clear();
					this.city.sendKeys("Blr");
					
		}
		
		@FindBy(xpath="//select[@name='country_id']")
		private WebElement country;

		public void selectCountry() 
		{			
		Select se = new Select(country);
		se.selectByValue("India");
					//this.country.sendKeys("India");
					
		}
		
		@FindBy(xpath="//select[@name='zone_id']")
		private WebElement region;

		public void selectRegion() 
		{			
		Select se = new Select(region);
		se.selectByVisibleText("Karnataka");
		}
		
		@FindBy(xpath="//input[@value='Continue']")
		private WebElement cntnBtn;
		
		public void clickCntnBtn()
		{
			this.cntnBtn.click();
		} 
		
		
		@FindBy(xpath="(//textarea[@class='form-control'])[2]")
		private WebElement textarea;

		public void sendTextarea() 
		{			this.textarea.clear();
					this.textarea.sendKeys("hjhgjhjg");
					
		}
		
		@FindBy(xpath="//input[@name='agree']")
		private WebElement agreeBtn;
		
		public void clickAgreeBtn()
		{
			this.agreeBtn.click();
		}
		
		@FindBy(xpath="//input[@id='button-shipping-method']")
		private WebElement cntBtn;
		
		public void clickCtnBtn()
		{
			this.cntBtn.click();
		} 
		
}
