package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.GetProductPricePage;
import com.crm.qa.pages.LoginPage;

public class getProductPriceTest extends TestBase{
	LoginPage loginPage;
	GetProductPricePage price;
	
	public getProductPriceTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test()
	public void getProductPrice(){
		price = new GetProductPricePage();
		price.getProductPrice();
		loginPage.logoutClick();
	}
		
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
