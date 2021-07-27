package com.ros.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ros.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	@FindBy(xpath ="//button[contains(text(),'LOGIN')]")
	WebElement loginBtn;
	

	//Intializing The Page Objects
	public  LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLandingPageTitle() {
		return driver.getTitle();
	}
	
	public LoginPage loginPage() {
		loginBtn.click();
		return new LoginPage();
	}
	
	

}
