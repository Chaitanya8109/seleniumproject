package com.automation.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement userButton;

	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	private WebElement adminButton;

	@FindBy(xpath ="//a[@class='oxd-main-menu-item active']") 
	private WebElement PimButton;

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']")
	private WebElement leaveButton;

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M21,24H11a')]")
	private WebElement upgradeButton;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	private WebElement LogOutLink;

	public void clickUserButton() {
		userButton.click();
	}

	public void clickAdminButton() {
		adminButton.click();
	}

	public void clickpimButton() {
		PimButton.click();
	}

	public void clickLeaveButton() {
		leaveButton.click();;
	}
	
	public void clickUpgradeButton() {
		upgradeButton.click();
	}
	
	public void clickLogoutLink() {
		LogOutLink.click();
	}
}

