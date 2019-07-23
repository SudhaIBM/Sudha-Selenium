package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAdd_InvalidData_ExcelPOM 
{
private WebDriver driver; 
	
	public AdminAdd_InvalidData_ExcelPOM(WebDriver driver)
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
	
	@FindBy(xpath="//a[@data-original-title='Add New']")
	private WebElement addNew;

	public void clickAddNew() 
	{
				this.addNew.click();
	}
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement productName;


	
	public void sendProductName(String productName ) 
	{
				this.productName.clear();
				this.productName.sendKeys(productName);
	}
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement metaTagTitle;
	
	public void sendMetaTagTitle(String metaTagTitle ) 
	{
				this.metaTagTitle.clear();
				this.metaTagTitle.sendKeys(metaTagTitle);
	}
	
	@FindBy(xpath="//a[.='Data']")
	private WebElement dataTab;

	public void clickDataTab() 
	{
				this.dataTab.click();
	}
	
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement model;
	
	public void sendModel(String model) 
	{
				this.model.clear();
				this.model.sendKeys(model);
	}
	
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement price;
	
	public void sendPrice(String price) 
	{
				this.price.clear();
				this.price.sendKeys(price);
	}
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantity;
	
	public void sendQuantity(String quantity) 
	{
				this.quantity.clear();
				this.quantity.sendKeys(quantity);
	}
	
	@FindBy(xpath="//a[.='Links']")
	private WebElement linksTab;

	public void clickLinksTab() 
	{
				this.linksTab.click();
	}
	
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement categories;

	public void sendCategories(String categoriesValue ) 
	{			this.categories.clear();
				this.categories.sendKeys(categoriesValue);
				
	}
	
	@FindBy(xpath="(//a[.='Reward Points'])[2]")
	private WebElement rewardPointsTab;

	public void clickRewardPointsTab() 
	{
				this.rewardPointsTab.click();
	}

	@FindBy(xpath="//input[@name='points']")
	private WebElement points;

	public void sendPoints(String points) 
	{			this.points.clear();
				this.points.sendKeys(points);
				
	}
	
	@FindBy(xpath="//i[@class ='fa fa-save']")
	private WebElement saveBtn;

	public void clickSaveBtn() 
	{
				this.saveBtn.click();
	}
	
}
