package com.ros.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ros.qa.base.TestBase;

public class CashPdQ extends TestBase {
	
	public CashPdQ() {
		super();
	}
	
	@FindBy(xpath = "//input[@type='number' and @class='mat-input-element mat-form-field-autofill-control ng-tns-c136-193 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
	WebElement FoodDrinks;
	
	
	@FindBy(xpath = "//input[@type='number' and @class='mat-input-element mat-form-field-autofill-control ng-tns-c136-194 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
	WebElement Sundries;
	
	@FindBy(xpath = "//input[@type='number' and @class='mat-input-element mat-form-field-autofill-control ng-tns-c136-195 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
	WebElement Maintenance;
	
	@FindBy(xpath = "//input[@type = 'number' and @class = 'mat-input-element mat-form-field-autofill-control ng-tns-c136-196 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
	WebElement Till1;
	
	@FindBy(xpath = "//input[@id='mat-input-139']")
	WebElement Till2;
	
	@FindBy(xpath = "//input[@type ='number' and @class = 'mat-input-element mat-form-field-autofill-control ng-tns-c136-198 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
	WebElement Till3;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-dark push-right mr-3']")
	WebElement saveasDraftButton;
	
	public String ValidateCashAndPDQtitle() {
		return driver.getTitle();
	}
	
	public void FoodDrinks() {
	FoodDrinks.sendKeys("22");
	Sundries.sendKeys("12");
	Maintenance.sendKeys("10");
	Till1.sendKeys("10");
	Till2.sendKeys(null);
	
	}
//	Set<String> handler = driver.getWindowHandles();
//	
//	Iterator<String> it = handler.iterator();
//	
//	String parentWindowId = it.next();
//	
//	String childWindowId = it.next();
//	
//	driver.switchTo().window(childWindowId);
	
	}

