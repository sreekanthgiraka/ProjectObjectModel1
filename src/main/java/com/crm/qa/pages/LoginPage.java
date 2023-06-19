package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(id = "user-name")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login-button")
	private WebElement loginSubmit;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutIcon;

	@FindBy(id = "react-burger-menu-btn")
	private WebElement mainMenu;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public void login(String un, String pwd){
		userName.sendKeys(un);
		System.out.println("Username entererd successfully.");
		passWord.sendKeys(pwd);
		System.out.println("Password entererd successfully.");
		loginSubmit.click();
		System.out.println("Login button clicked successfully.");
	}
	
	public void logoutClick() {
		try {
			Thread.sleep(2000);
			mainMenu.click();
			Thread.sleep(2000);
			logoutIcon.click();
			// Thread.sleep(2000);
			//  WebPageActionsUtil.click(getDriver(), signoutBtn);
			System.out.println("Logout Button clicked");

		} catch (Exception e) {
			System.out.println("Error occurred while login. {}");
		}
	} // End of logoutClick method.
	
}
