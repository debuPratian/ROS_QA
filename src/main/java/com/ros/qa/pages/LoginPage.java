package com.ros.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ros.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//input[@name ='Email Address']")
	WebElement userName;
	
	
	@FindBy(xpath = "//input[@name ='Password']")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login() {
		userName.sendKeys("vikas.narsappa@pratian.com");
		password.sendKeys("Password@123");
		loginBtn.click();
		
		return new HomePage();
	}

}
