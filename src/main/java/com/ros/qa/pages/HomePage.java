package com.ros.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ros.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(), 'ADD NEW')]")
	WebElement addNewbtn;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePagetitle() {
		return driver.getTitle();
	}
	
	public AddnewEposPage clickonNewAddbutton() {
		addNewbtn.click();
		return new AddnewEposPage();
	}

}
