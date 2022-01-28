package com.stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageObjects.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Baseclass {

	@Before
	public void setUp() throws IOException {
		
		configprop=new Properties();
		FileInputStream fis=new FileInputStream("config.properties");
		configprop.load(fis);
		String browser=configprop.getProperty("browser");
		String chromepath=configprop.getProperty("chromepath");
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
	}

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {

		lp = new LoginPage(driver);
	}

	@When("user enter url {string}")
	public void user_enter_url(String url) {
		driver.get(url);
	}

	@When("user enters {string} as email and {string} in the password field")
	public void user_enters_as_email_and_in_the_password_field(String email, String passwrd) {
		lp.setEmail(email);
		lp.setPassword(passwrd);
	}

	@When("click login button")
	public void click_login_button() {
		lp.clickloginbtn();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful")) {
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@When("user will clicl on logout")
	public void user_will_clicl_on_logout() throws InterruptedException {
		lp.clicklogoutbtn();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	// New Customer ... new steps
	@Then("user can view Dashboard")
	public void user_can_view_dashboard() {
	}

	@When("user clicks customer menu")
	public void user_clicks_customer_menu() {
	}

	@When("clicks on Customer")
	public void clicks_on_customer() {
	}

	@When("clicks on Add new")
	public void clicks_on_add_new() {
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
	}

	@Then("user can view {string} message")
	public void user_can_view_message(String string) {

	}

}
