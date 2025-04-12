package com.automation.elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	private WebElement adminButton;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement name;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement username;

	public void clickAdminButton() {
		adminButton.click();
	}

	public void userName() {
		username.sendKeys("Chaitanya");
	}

	public void name() {
		name.click();
	}

}
