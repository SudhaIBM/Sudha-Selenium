package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;

import com.training.pom.AdmnAddMlpPrd_ExeclDataPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_071_AdmnAddMlpPrd_ExeclData {
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
	
	@Test(priority=2, dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void  adminAddMulProdExcelTest(String productName, String metaTitle, String model, String price, String category, String quantity, String points ) throws InterruptedException {
		AdmnAddMlpPrd_ExeclDataPOM adminAddProdExcel= new AdmnAddMlpPrd_ExeclDataPOM(driver);
		Thread.sleep(3000);
		
		adminAddProdExcel.clickMenu();
		adminAddProdExcel.clickCatalog();
		adminAddProdExcel.clickProducts();
		adminAddProdExcel.clickAddNew();
		adminAddProdExcel.sendProductName(productName);
		adminAddProdExcel.sendMetaTagTitle(metaTitle);
		adminAddProdExcel.clickDataTab();
		adminAddProdExcel.sendModel(model) ;
		adminAddProdExcel.sendPrice(price);
		adminAddProdExcel.sendQuantity(quantity);
		adminAddProdExcel.clickLinksTab();
		adminAddProdExcel.sendCategories(category);
		adminAddProdExcel.clickRewardPointsTab();
		adminAddProdExcel.sendPoints(points);
		adminAddProdExcel.clickSaveBtn();
		Thread.sleep(3000);
	}
}
