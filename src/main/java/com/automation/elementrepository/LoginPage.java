package com.automation.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="username")
	private WebElement  usernameTextfeild;
	
	@FindBy(name="password")
	private WebElement passwordTextfeild;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	
	public void enterUsername(String username) {
		usernameTextfeild.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordTextfeild.sendKeys(password);
	}
	
    public void clickLoginButton() {
    	loginButton.click();
    }
                              
    public void login(String username,String password) {
    	enterUsername(username);
    	enterPassword(password);
    	clickLoginButton();
    }
    
}
