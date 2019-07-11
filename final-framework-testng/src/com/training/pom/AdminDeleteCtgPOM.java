package com.training.pom;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDeleteCtgPOM 
{
private WebDriver driver; 
	
	public AdminDeleteCtgPOM(WebDriver driver)
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
	
	@FindBy(xpath="//h1[.='Categories']")
	private WebElement CategoriesText;
	
	public String  getCategoryText()
	{
		return this.CategoriesText.getText(); 
		
	}
	@FindBy(xpath="//a[.='Categories']")
	private WebElement Categories;
	
	public void clickCategories() 
	{
				this.Categories.click();
	}
	
	@FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
	private WebElement CategoriesEdit;
	
	public void clickCategoriesEdit() 
	{
				this.CategoriesEdit.click();
				driver.navigate().back();
	}
	
	@FindBy(xpath="//input[@value='596']")
	private WebElement Accessories;
	
	public void selectAccessories() 
	{
				this.Accessories.click();
				
	}
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement DeleteBtn;
	
	public void clickDeleteBtn() 
	{
				this.DeleteBtn.click();
				//driver.switchTo().alert().accept();
				driver.switchTo().alert().dismiss();
				
	}
}
