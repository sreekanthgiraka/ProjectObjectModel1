package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.OrderProductPage;
import com.crm.qa.pages.removeProductPage;

public class removeProductTest extends TestBase{
	LoginPage loginPage;
	removeProductPage remove;
	OrderProductPage order;
	
	public removeProductTest(){
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
		order = new OrderProductPage();
		remove = new removeProductPage();		
		order.addToCart();
		order.cart();
		remove.removeProduct();
		loginPage.logoutClick();
	}
		
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
