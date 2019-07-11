package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminAddProductPOM 
{
private WebDriver driver; 
	
	public AdminAddProductPOM(WebDriver driver)
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
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement description;
	
	public void sendDescription(String description ) 
	{
				this.description.clear();
				this.description.sendKeys(description);
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

	public void clickCategories() 
	{			this.categories.clear();
				this.categories.sendKeys("Accessories");
				
	}
	
	@FindBy(xpath="//a[.='Attribute']")
	private WebElement attributeTab;

	public void clickAttributeTab() 
	{
				this.attributeTab.click();
	}
	
	@FindBy(xpath="//a[.='Option']")
	private WebElement optionTab;

	public void clickOptionTab() 
	{
				this.optionTab.click();
	}
	
	@FindBy(xpath="//a[.='Recurring']")
	private WebElement recurringTab;

	public void clickRecurringTab() 
	{
				this.recurringTab.click();
	}
	
	@FindBy(xpath="//a[.='Discount']")
	private WebElement discountTab;

	public void clickDiscountTab() 
	{
				this.discountTab.click();
	}
	
	@FindBy(xpath="//a[.='Special']")
	private WebElement specialTab;

	public void clickSpecialTab() 
	{
				this.specialTab.click();
	}
	
	@FindBy(xpath="//a[.='Image']")
	private WebElement imageTab;

	public void clickImageTab() 
	{
				this.imageTab.click();
	}
	
	@FindBy(xpath="//a[.='Reward Points']")
	private WebElement rewardPointsTab;

	public void clickRewardPointsTab() 
	{
				this.rewardPointsTab.click();
	}
	
	@FindBy(xpath="//a[.='Design']")
	private WebElement designTab;

	public void clickDesignTab() 
	{
				this.designTab.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement saveBtn;

	public void clickSaveBtn() 
	{
				this.saveBtn.click();
	}
}
