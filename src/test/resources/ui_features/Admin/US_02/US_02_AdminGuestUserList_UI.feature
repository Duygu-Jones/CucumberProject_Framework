@UI_US02_TC01

Feature: US02 Guest_User_List

  Background: User goes application page
    Given dj admin goes the page url
    When  dj admin clicks to login button
    And   dj admin login with user credentials

  Scenario: US02_TC01 Admin See Guest User List

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


     
