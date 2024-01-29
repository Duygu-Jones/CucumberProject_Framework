@E2E_US04

  Feature: US_04 Dean Management by the Admin

    @UI
    Scenario: US04_TC01 Admin Adds Dean to the website UI
      Given admin goes the page url dj
      When  admin clicks to login button dj
      And   admin login with user credentials dj
      And  dj Admin clicks on the menu button
      And  dj Admin clicks on the dean management button
      And  dj User clicks on the gender "FEMALE" button
      And  dj Fills the required information and clicks on Submit Button
      #Then dj Admin verifies if the Dean Saved popup is displayed
      And  dj close the browser


    Scenario: US04_TC02 Admin sends GET request to get Dean information from the website api
      Given Login as "Admin"
      Then dj Admin saved the userID after created Dean
      Then dj Admin creates GET Request with the URL and dean-search path parameters
      Then dj Admin creates Expected Response Body for Get
      And dj Admin sends GET Request and saves the response
      And dj Admin verifies Status-Code is 200
      And dj Admin verifies Content-Type is "application/json"
      And dj Admin verifies GET Response Body as expected

    Scenario: Verify Registered Dean Information
      Given dj Connect to the Database
      Then dj Admin creates Expected Response Body for Get
      And dj send a Query to get the Dean GetManagerById
      And dj verify registered Dean information
      And Cut the connection


    Scenario: US04_TC03 Admin send DELETE Request to delete Dean from the website api
      Given Login as "Admin"
      Then dj Admin creates DELETE Request with the URL and dean-delete-userID path parameters
      And dj Admin sends DELETE Request and saves the response
      Then dj Admin verifies Status-Code is 200 for delete request
      And dj Admin verifies Content-Type is "application/json"
      And dj Admin verifies DELETE Response Body as expected


        #   OK          : 200
        #   Created     : 201
        #   Error / Unauthorized : 401
        #   Forbidden   : 403
        #   Not Found   : 404

        #  --------> Dean Request Body
        #   {
        #     "birthDay": "1975-05-05",
        #     "birthPlace": "Izmir",
        #     "gender": "FEMALE",
        #     "name": "Duygu",
        #     "password": "Project14",
        #     "phoneNumber": "555-275-8196",
        #     "ssn": "568-72-9305",
        #     "surname": "Jones",
        #     "username": "jnsduygu"
        #   }

        #  -------> Response Body
        #  {
        #     "object": {
        #                 "userId"  : 3701,
        #                 "username": "jnsduygu",
        #                 "name"    : "Duygu",
        #                 "surname" : "Jones",
        #                 "birthDay": "1975-05-05",
        #                 "ssn"     : "568-72-9305",
        #                 "birthPlace"  : "Izmir",
        #                 "phoneNumber" : "555-275-8196",
        #                 "gender"      : "FEMALE"
        #               },
        #     "message"   : "Dean Saved",
        #     "httpStatus": "CREATED"
        #  }

        #  --------> Delete response body
        #   {
        #     "message"     : "Dean Deleted",
        #     "httpStatus"  : "OK"
        #   }




