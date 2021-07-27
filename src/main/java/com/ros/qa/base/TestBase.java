package com.ros.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ros.qa.ExceptionHandling.PropertyManager;
import com.ros.qa.util.TestUtil;

public class TestBase {
	
	public static  WebDriver driver ;
	public static Properties prop;
	
		
//		try {
//		prop = new Properties();
//		FileInputStream ip = new FileInputStream(System.getProperty("users.dir") 
//	+ "src/main/java/com/ros/qa/config/config.properties");
//		prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void intialization() throws IOException {
		
			System.setProperty("webdriver.chrome.driver", "C:/Users/Debanjan.Bhowmick/Desktop/Driver/chromedriver.exe");
			driver = new ChromeDriver();
//			else if(browserName.equals("FF")) {
//			System.setProperty("webdriver.gecko.driver", "C:/Users/Debanjan.Bhowmick/Desktop/Driver/geckodriver.exe");
//			driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(PropertyManager.getProperty("url.app"));
	//driver.get("https://app.test.restaurantonesolution.com/login");
		}
}
