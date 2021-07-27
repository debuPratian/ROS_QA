package com.ros.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ros.qa.base.TestBase;
import com.ros.qa.pages.HomePage;
import com.ros.qa.pages.LandingPage;
import com.ros.qa.pages.LoginPage;
import com.ros.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	LandingPage landPage;
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest ()  {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
	   intialization();
		testUtil = new TestUtil();
		landPage = new LandingPage();
		loginPage = landPage.loginPage();
		homePage = new HomePage();
	}
	
	
	@Test(priority = 1) 
	public void loginTest() {
		String title = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(title, "ROS - Login");
	}
	
	@Test(priority = 2) 
	public void verifyHomePagetitle() {
		homePage = loginPage.login();
		Assert.assertEquals(driver.getTitle(), "Choose your account");
	}
	
	
	@AfterMethod
	@Test
	public void tearDown() {
		driver.quit();
	}

}
