package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPOM 

{
private WebDriver driver; 
	
	public DashboardPOM(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[.='Dashboard']")
	private WebElement DashboardText;
	
	public String  getDashboardText()
	{
		return this.DashboardText.getText(); 
		
	}
}
