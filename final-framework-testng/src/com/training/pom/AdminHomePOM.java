package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePOM 
{
private WebDriver driver; 
	
	public AdminHomePOM(WebDriver driver)
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
	}

