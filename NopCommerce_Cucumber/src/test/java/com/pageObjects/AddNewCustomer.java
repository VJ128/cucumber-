package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	public WebDriver driver;

	public AddNewCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")
	WebElement custbtn;
	
	@FindBy(xpath="//p[contains(text(),' Customers')]")
	WebElement custlink;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement addNewbtn;
	

}
