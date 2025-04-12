package com.automation.base;

import com.automation.elementrepository.Homepage;
import com.automation.elementrepository.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void logoutFromApplication() {
    Homepage homepage = new Homepage(driver);
    		homepage.clickUserButton();
    		homepage.clickLogoutLink();
	}       

	@BeforeMethod
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin123");
	}

	@AfterClass
	public void afterClass() {
	}

}
