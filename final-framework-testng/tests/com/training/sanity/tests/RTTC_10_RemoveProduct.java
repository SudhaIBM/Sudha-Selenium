package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DashboardPOM;
import com.training.pom.LoginPOM;
import com.training.pom.RemoveProductPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_10_RemoveProduct {
	private WebDriver driver;
	private String userURL;
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
		userURL = properties.getProperty("userURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(userURL);
	}

	
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void  removeItemTest() throws InterruptedException {
		RemoveProductPOM removeProduct = new RemoveProductPOM(driver);
		Thread.sleep(3000);
		
		removeProduct.clickDonec();
		removeProduct.clickAdd();
		removeProduct.clickCart();
		removeProduct.clickViewcart();
		removeProduct.clickRemove();
		Thread.sleep(3000);
	}
}
