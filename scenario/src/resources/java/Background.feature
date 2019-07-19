Feature: Login functionality
Background: Browser launch
Given user should have browser installed
When user enters AUT URL in browser
Then Application must open in browser

Scenario: user login
Given user must be registered
When user enters the credentials and clicks on login
Then user must be loged in

Scenario: user registration
Given user must be logged in
When user enters all mandatory fields
Then user is registered

Scenario: searching
Given user must be logged in
When user searches for a product
Then products details must be displayed