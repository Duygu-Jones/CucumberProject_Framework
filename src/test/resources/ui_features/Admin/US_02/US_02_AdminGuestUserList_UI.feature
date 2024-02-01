@UI_US02

Feature: US02 GuestUser List Management

  Scenario: US02 TC01 Register as a GuestUser on the website UI
    Given dj user goes to the page Url
    Then dj Clicks on the register button
    And  dj User clicks on the gender "FEMALE" button
    And  dj Fills the required information and clicks on Register
    And dj close the browser

  Scenario: US02 TC02 Admin See Guest User List
    Given dj user goes to the page Url
    When  dj admin clicks to login button
    And   dj admin login with user credentials
    Then tb user verifies if navigated to the admin management page
    And  dj user clicks on the menu button
    And  dj user clicks the guest user button
    And  dj user verifies,Guest User List title is visible
    And  dj user verifies,name is visible
    And  dj user verifies, phone number is visible
    And  dj user verifies, ssn is visible
    And  dj user verifies, Username is visible
    And  dj user clicks the delete
    And  dj close the browser

