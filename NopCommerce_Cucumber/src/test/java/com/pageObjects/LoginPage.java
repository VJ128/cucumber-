package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtemail;

	@FindBy(id = "Password")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutbtn;
	
	public void setEmail(String email) {
		txtemail.clear();
		txtemail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void clickloginbtn() {
		loginbtn.click();
	}
	public void clicklogoutbtn() {
		logoutbtn.click();
	}

}
