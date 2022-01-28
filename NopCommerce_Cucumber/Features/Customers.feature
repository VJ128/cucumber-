Feature: Customers
Scenario: Add new customer
 Given User launch chrome browser 
  When user enter url "https://admin-demo.nopcommerce.com/login"
  And user enters "admin@yourstore.com" as email and "admin" in the password field
  And click login button
Then user can view Dashboard
When user clicks customer menu
And clicks on Customer
And clicks on Add new
Then user can view add new customer page
When user enter customer info
And user click on save button
Then user can view "The new customer has been added successfully" message
 And close browser
