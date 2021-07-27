package com.ros.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ros.qa.base.TestBase;
import com.ros.qa.pages.AddnewEposPage;
import com.ros.qa.pages.HomePage;
import com.ros.qa.pages.LandingPage;
import com.ros.qa.pages.LoginPage;
import com.ros.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	AddnewEposPage addnewEposPage;
	TestUtil testUtil;
	
	public HomePageTest () {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
	//	testUtil = new TestUtil();
		landingPage = new LandingPage();
		loginPage = landingPage.loginPage();
		homePage = loginPage.login();
		addnewEposPage = homePage.clickonNewAddbutton();
	}
	
	@Test(priority = 1)
	public void validateAddNewCashupPagetitleTest() {
		addnewEposPage = homePage.clickonNewAddbutton();
		String title = addnewEposPage.validateAddNewcashupPageTitle();
		Assert.assertEquals(title, "ROS - Cashup");
	}
	
	@Test(priority =  2)
	public void addEposSheet() {
		addnewEposPage.clickonCalendaroption();
		addnewEposPage.clickonMonthYear();
		addnewEposPage.clickOnselectheYear();
		addnewEposPage.ClickontheMonth();
		addnewEposPage.clickontheDate();
		addnewEposPage.clickonAPIButton();
		String text = addnewEposPage.validateThealertMessge();
		Assert.assertEquals(addnewEposPage.validateThealertMessge(), text);
			    
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
