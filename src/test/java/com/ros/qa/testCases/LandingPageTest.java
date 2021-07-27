package com.ros.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ros.qa.base.TestBase;
import com.ros.qa.pages.LoginPage;
import com.ros.qa.pages.HomePage;
import com.ros.qa.pages.LandingPage;
import com.ros.qa.util.TestUtil;

public class LandingPageTest extends TestBase {
	
	LandingPage landPage;
	LoginPage loginPage;
	TestUtil testUtil;
	
	public LandingPageTest ()  {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		testUtil = new TestUtil();
		landPage = new LandingPage();
	//	loginPage = landPage.loginPage();
	}
	
	@Test(priority =  1 )
	public void landingPageTitleTest() {
		String title = landPage.validateLandingPageTitle();
		Assert.assertEquals(title, "ROS - Login");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
