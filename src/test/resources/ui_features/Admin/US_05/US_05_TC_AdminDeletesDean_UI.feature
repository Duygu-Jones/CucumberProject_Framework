@UI_US05
Feature: US_05 Admin can see and delete deans on the website

  Background: Admin goes application page
    Given dj Admin goes the page url
    When  dj Admin clicks to login button
    And   dj Admin login with user credentials


  Scenario: US05_TC01 Admin can see deans on the website
    Then dj admin verifies if navigated to the admin management page
    When dj admin clicks on the menu button
    And  dj admin clicks on the dean management button
    And  dj admin see the dean list
    And  dj admin verifies,name is visible
    And  dj admin verifies,gender is visible
    And  dj admin verifies, phone number is visible
    And  dj admin verifies, ssn is visible
    And  dj admin verifies, Username is visible
    And  dj close the browser



  Scenario: US05_TC01 Admin can edit(can not delete) deans on the website
    Then dj admin verifies if navigated to the admin management page
    When dj admin clicks on the menu button
    And  dj admin clicks on the dean management button
    And  dj admin see the dean list
    And  dj admin clicks on the edit button
    And  dj admin clicks on the gender female button
    And  dj admin fills the password box
    And  dj admin clicks on the submit button
    Then dj admin verifies if the Dean Updated Successfully popup is displayed
    And  dj admin clicks on the edit-close X button
    And  dj close the browser




