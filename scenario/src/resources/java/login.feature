Feature: Login functionality
#Scenario: Login functionality
#Scenario Outline: Login Fucntionality
Scenario: Login functionality
Given user registered
When user enter username as username  and  password
|username||password|
|adcbg12||123|
|wrthj13||564|

Then user is directed to homepage

#Examples:
#|username||password|
#|adcbg12||123|
#|wrthj13||123|

#Background: Browser launch
#Given user should have browser installed
#When user enters AUT URL in browser
#Then Application must open in browser

#@Login
#Scenario: user login
#Given user must be registered
#When user enters the credentials and clicks on login
#Then user must be loged in
#@Login @Register
#Scenario: user registration
#Given user must be logged in
#When user enters all mandatory fields
#Then user is registered
 #@Search
#Scenario: searching
#Given user must be logged in
#When user searches for a product
#Then products details must be displayed