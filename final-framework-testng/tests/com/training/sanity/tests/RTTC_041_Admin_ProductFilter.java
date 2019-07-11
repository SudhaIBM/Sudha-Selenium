package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminDeleteCtgPOM;
import com.training.pom.AdminProductFilterPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_041_Admin_ProductFilter 
{
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test (priority=1)
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		//screenShot.captureScreenShot("First");
	}
	
	@Test(priority=2)
	public void  adminFilterTest() throws InterruptedException {
		AdminProductFilterPOM adminProductFilter = new AdminProductFilterPOM(driver);
		Thread.sleep(3000);
		
		adminProductFilter.clickMenu();
		adminProductFilter.clickCatalog();
		adminProductFilter.clickProducts();
		adminProductFilter.sendProductName("Ear");
		adminProductFilter.clickFilterBtn();
		adminProductFilter.sendPrice("500");
		adminProductFilter.clickFilterBtn();
		adminProductFilter.selectStatus();
		adminProductFilter.clickFilterBtn();
		adminProductFilter.sendModel("Model23");
		adminProductFilter.clickFilterBtn();
		adminProductFilter.sendQuantity("100");
		adminProductFilter.clickFilterBtn();
		adminProductFilter.selectImage();
		adminProductFilter.clickFilterBtn();
		Thread.sleep(3000);
	}
}
