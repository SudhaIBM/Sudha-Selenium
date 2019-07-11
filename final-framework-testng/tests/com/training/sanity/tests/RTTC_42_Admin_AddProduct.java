package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminAddProductPOM;
import com.training.pom.AdminProductFilterPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_42_Admin_AddProduct
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
	public void  adminAddProduct() throws InterruptedException {
		AdminAddProductPOM adminAddProduct = new AdminAddProductPOM(driver);
		Thread.sleep(3000);
		
		adminAddProduct.clickMenu();
		adminAddProduct.clickCatalog();
		adminAddProduct.clickProducts();
		adminAddProduct.clickAddNew();
		adminAddProduct.sendProductName("Book1");
		adminAddProduct.sendDescription("i isaac take thee rebekah");
		adminAddProduct.sendMetaTagTitle("i isaac take thee rebekah");
		adminAddProduct.clickDataTab();
		adminAddProduct.sendModel("SKU-200");
		adminAddProduct.sendPrice("2000");
		adminAddProduct.sendQuantity("50");
		adminAddProduct.clickLinksTab();
		adminAddProduct.clickCategories();
		adminAddProduct.clickAttributeTab();
		adminAddProduct.clickOptionTab();
		adminAddProduct.clickRecurringTab();
		adminAddProduct.clickDiscountTab();
		adminAddProduct.clickSpecialTab();
		adminAddProduct.clickImageTab();
		adminAddProduct.clickRewardPointsTab();
		adminAddProduct.clickDesignTab();
		adminAddProduct.clickSaveBtn();
		
		
	}
}
