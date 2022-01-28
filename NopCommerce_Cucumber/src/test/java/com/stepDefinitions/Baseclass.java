package com.stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.pageObjects.AddNewCustomer;
import com.pageObjects.LoginPage;

public class Baseclass {

	public WebDriver driver;
	public LoginPage lp;
	public AddNewCustomer anc;
	public Properties configprop;

	public static String randomString() {
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}

}
