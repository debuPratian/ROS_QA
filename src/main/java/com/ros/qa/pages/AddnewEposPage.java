package com.ros.qa.pages;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ros.qa.base.TestBase;

public class AddnewEposPage extends TestBase {
	
	@FindBy(xpath = "//button[@class ='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement selecthecalendaricon;
	
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']")
	WebElement selecttheMonthYear;
	
	@FindBy(xpath = "//tbody/tr[6]/td[4]/div[1]")
	WebElement choosetheYear;
	
	@FindBy(xpath = "//div[contains(text(),'JUL')]")
	WebElement selectheMonth;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]")
	WebElement selectheDate;
	
	@FindBy(xpath = "//button[@type ='button' and @class= 'btn btn-light border-dark bg-transparent mx-2 px-5']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//body/ngx-app[1]/ngx-one-column-layout[1]/nb-layout[1]/div[1]/"
			+ "div[1]/div[1]/div[1]/div[1]/nb-layout-column[2]/ngx-cash-management[1]/"
			+ "ngx-new-cashup[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/"
			+ "div[1]/div[2]/button[1]")
	WebElement FetchApidataButton;
	
	@FindBy(xpath = "//div[@class = 'alert alert-success']")
	WebElement apiMessage;
	
	
	
	@FindBy(css = "body > ngx-app > ngx-one-column-layout > nb-layout > div.scrollable-container > div > div > div > div > nb-layout-column.ros-content > ngx-cash-management > "
			+ "ngx-new-cashup > div > div.newcashup-content > div > form > div.row > div.col-9 > div.container > div:nth-child(1) > div.d-flex.justify-content-between.mb-3 > div.d-flex.align-items-center.flex-wrap > div > span > div")
	WebElement alertMessage;

	public AddnewEposPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddNewcashupPageTitle() {
		return driver.getTitle();
		
	}	
	
	public  void clickonCalendaroption() {
			selecthecalendaricon.click();
		}
		
	public	 void clickonMonthYear() {
			selecttheMonthYear.click();
		}
		
	public void clickOnselectheYear() {
			choosetheYear.click();
		}
		
	public void ClickontheMonth() {
			selectheMonth.click();
		}
		
	public void clickontheDate() {
			selectheDate.click();
		}
		
	public void clickonAPIButton() {
			FetchApidataButton.click();
		}
	
	public String validateThealertMessge() {
		return alertMessage.getText();
	}
	
	public CashPdQ ClickonNextButton() {
		nextBtn.click();
		return new CashPdQ();
		
	}
		

	
}

//	Set<String> handler = driver.getWindowHandles();
//	
//	Iterator<String> it = handler.iterator();
//	
//	String parentWindowId = it.next();
//	
//	String childWindowId = it.next();
//	
//	driver
	