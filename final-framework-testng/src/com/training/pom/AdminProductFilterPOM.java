package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminProductFilterPOM 
{
private WebDriver driver; 
	
	public AdminProductFilterPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='fa fa-indent fa-lg']")
	private WebElement Menu;
	
	public void clickMenu() 
	{
		
		this.Menu.click();
	}
	@FindBy(xpath="//span[.='Catalog']")
	private WebElement catalog;
	
	public void clickCatalog() 
	{
				this.catalog.click();
	}
	
	@FindBy(xpath="//a[.='Products']")
	private WebElement products;


	
	public void clickProducts() 
	{
				this.products.click();
	}
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement productName;


	
	public void sendProductName(String productName ) 
	{
				this.productName.clear();
				this.productName.sendKeys(productName);
	}
	
	@FindBy(xpath="//button[@id='button-filter']")
	private WebElement filterBtn;
	
	public void clickFilterBtn() 
	{
		this.filterBtn.click();
}
	
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement price;


	
	public void sendPrice(String price) 
	{
				this.price.clear();
				this.price.sendKeys(price);
	}
	
	@FindBy(xpath="//select[@id='input-status']")
	private WebElement status;

	
	public void selectStatus() 
	{
				
				Select sel = new Select(status);
				sel.selectByVisibleText("Enabled");
				
	}

	@FindBy(xpath="//input[@id='input-model']")
	private WebElement model;


	
	public void sendModel(String model) 
	{
				this.model.clear();
				this.model.sendKeys(model);
	}
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantity;


	
	public void sendQuantity(String quantity) 
	{
				this.quantity.clear();
				this.quantity.sendKeys(quantity);
	}
	
	@FindBy(xpath="//select[@id='input-image']")
	private WebElement image;

	
	public void selectImage() 
	{
				
				Select sel = new Select(image);
				sel.selectByVisibleText("Enabled");
				
	}
}
