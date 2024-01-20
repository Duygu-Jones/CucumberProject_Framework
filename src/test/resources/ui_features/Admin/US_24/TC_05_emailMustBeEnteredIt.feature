@UI_24_05
Feature: Admin should be able to create teachers.

  Scenario: TC_05 Admin should be able to create teachers.
    Given User enters the website_hu.
    When User clicks on login_hu.
    And Username in the box "Team05Admin" enters_hu.
    And Password in the box "Project14" enters_hu.
    And Click on the login button_hu.
    And Clicks the menu button_hu.
    And Teacher Management clicks the button_hu.
    And JavaScript choose your lesson_hu.
    And Name in the box "Halil" enters_hu.
    And SurName  in the box "Uslu" enters_hu.
    And BirthPlace in the box "a place name" enters_hu.
    And Email in the box "e mail" enters_hu.
    And Phone in the box "a phone number" enters_hu.
    And Is Advisor Teacher_hu.
    And Gender "MALE" enters your option_hu.
    And DateOfBirth in the box "01/01/1983" enters_hu.
    And SSN in the box "an ssn number" enters_hu.
    And UserName new "a username" enters the box_hu.
    And Enter the password "Karaman1" in the password box_hu.
    And Submit clicks the button_hu.
    Then Email registration has been confirmed_hu.
    Then Close page_hu.

