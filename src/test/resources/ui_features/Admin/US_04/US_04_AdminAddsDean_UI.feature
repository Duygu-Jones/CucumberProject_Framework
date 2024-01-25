@UI_US04
Feature: US_04 Admin add Dean to the website

  Background: Admin goes application page
    Given admin goes the page url dj
    When  admin clicks to login button dj
    And   admin login with user credentials dj

  Scenario: US04_TC01 Admin adds Dean to the website

    Then dj Admin verifies if navigated to the admin management page
    And  dj Admin clicks on the menu button
    And  dj Admin clicks on the dean management button
    And  dj Admin fills the name box
    And  dj Admin fills the surname box
    And  dj Admin fills the birthplace box
    And  dj Admin clicks on the gender "FEMALE" button
    And  dj Admin fills the date of birth box
    And  dj Admin fills the phone box
    And  dj Admin fills the ssn box
    And  dj Admin fills the username box
    And  dj Admin fills the password box
    And  dj Admin clicks on the submit button
    Then dj Admin verifies if the Dean Saved popup is displayed
    And  dj close the browser


  Scenario Outline: US04_TC02 Admin add Dean to the website(Negative Scenario mistake Ssn)

    And  dj Admin verifies if navigated to the admin management page
    And  dj Admin clicks on the menu button
    And  dj Admin clicks on the dean management button
    And  dj Admin fills the name box
    And  dj Admin fills the surname box
    And  dj Admin fills the birthplace box
    And  dj Admin clicks on the gender "FEMALE" button
    And  dj Admin fills the date of birth box
    And  dj Admin fills the phone box
    And  dj Admin fills the invalids "<Ssn>" ssn box
    And  dj Admin fills the username box
    And  dj Admin fills the password box
    And  dj Admin clicks on the submit button
    And  dj Admin verifies if the Ssn Ssn required text is displayed to the admin management page
    And  dj close the browser
    Examples:
      | Ssn |
      | 34562794787  |


  Scenario Outline: US04_TC03 Admin add Dean to the website(Negative Scenario empty name)

    And  dj Admin verifies if navigated to the admin management page
    And  dj Admin clicks on the menu button
    And  dj Admin clicks on the dean management button
    And  dj Admin fills the empty "<name>" box
    And  dj Admin fills the surname box
    And  dj Admin fills the birthplace box
    And  dj Admin clicks on the gender "FEMALE" button
    And  dj Admin fills the date of birth box
    And  dj Admin fills the phone box
    And  dj Admin fills the ssn box
    And  dj Admin fills the username box
    And  dj Admin fills the password box
    And  dj Admin clicks on the submit button
    And  dj Admin verifies if the name required text is displayed to the admin management page
    And  dj close the browser
    Examples:
      | name |
      |      |


  Scenario Outline: US04_TC04 Admin add Dean to the website(Negative Scenario don't use number for password and less than 8 character)

    And  dj Admin verifies if navigated to the admin management page
    And  dj Admin clicks on the menu button
    And  dj Admin clicks on the dean management button
    And  dj Admin fills the name box
    And  dj Admin fills the surname box
    And  dj Admin fills the birthplace box
    And  dj Admin clicks on the gender "FEMALE" button
    And  dj Admin fills the date of birth box
    And  dj Admin fills the phone box
    And  dj Admin fills the ssn box
    And  dj Admin fills the username box
    And  dj Admin fills the password box invalid "<password>"
    And  dj Admin clicks on the submit button
    And  dj Admin verifies if the valid phone number required text is displayed to the admin management page
    And  dj close the browser
    Examples:
      | password    |
      | UnitedState |




