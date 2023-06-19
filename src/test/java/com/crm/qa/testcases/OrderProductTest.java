/*
 *
 *@author sahithya.dasari
 *
 */

package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.OrderProductPage;

public class OrderProductTest extends TestBase{

	LoginPage loginPage;
	OrderProductPage order;
	
	public OrderProductTest(){
			super();			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@Test()
	public void orderProduct() throws Exception{
		order = new OrderProductPage();
		order.addToCart();
		order.cart();
		order.checkOut();
		order.firstName("Sreekanth");
		order.lastName("Giraka");
		order.postalCode("560034");
		order.continueClick();
		order.finish();
		loginPage.logoutClick();		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
