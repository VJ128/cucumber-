Feature: Login
 
 @sanity 	
Scenario: Successful login with valid credentials
  Given User launch chrome browser 
  When user enter url "https://admin-demo.nopcommerce.com/login"
  And user enters "admin@yourstore.com" as email and "admin" in the password field
  And click login button
  Then page title should be "Dashboard / nopCommerce administration"
  When user will clicl on logout
  Then page title should be "Your store. Login"
  And close browser
 
 @regression 
  Scenario Outline: data driven login
  Given User launch chrome browser 
  When user enter url "https://admin-demo.nopcommerce.com/login"
  And user enters "<email>" as email and "<password>" in the password field
  And click login button
  Then page title should be "Dashboard / nopCommerce administration"
  When user will clicl on logout
  Then page title should be "Your store. Login"
  And close browser
  
  
  Examples:
  |email|password|
  |admin@yourstore.com|admin|
  |admin123@yourstore.com|admin123|
  