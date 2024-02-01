@E2E_US02

Feature: US02 GuestUser Management

  Scenario: US02_TC01 Register as a GuestUser on the website UI
    Given dj user goes to the page Url
    Then dj Clicks on the register button
    And  dj User clicks on the gender "FEMALE" button
    And  dj Fills the required information and clicks on Register
    And dj close the browser


    Scenario: US02_TC02 Admin sends GET request to get GuestUser information from the website API
      Given Login as "Admin"
      Then dj Admin sends GET Request with the URL and saves the userID after GuestUser registered
      Then dj Admin creates Expected Response Body for guestUser
      And dj Admin verifies Status-Code 200 for guestUser
      And dj Admin verifies Content-Type is "application/json" for guestUser
      And dj Admin verifies GET Response Body as expected for guestUser


    Scenario: US02_TC03 Verify Registered GuestUser Information on DATABASE
      Given dj Connect to the Database for GuestUser
      Then dj Admin creates Expected Response Body for guestUser
      And dj send a Query to get the GuestUser GetManagerById
      And dj verify registered GuestUser information
      And Cut the connection for GuestUser


    Scenario: US02_TC04 Admin send DELETE Request to delete GuestUser from the website API
      Given Login as "Admin"
      Then dj Admin creates DELETE Request with the URL and guestUser-delete-userID path parameters for guestUser
      And dj Admin sends DELETE Request and saves the response for guestUser
      Then dj Admin verifies Status-Code 200 for delete guestUser
      And dj Admin verifies Content-Type is "application/json" for guestUser
      And dj Admin verifies DELETE Response Body as expected for guestUser


        #   OK          : 200
        #   Created     : 201
        #   Error / Unauthorized : 401
        #   Forbidden   : 403
        #   Not Found   : 404

        #  --------> GuestUser Request Body
        #   {
        #     "birthDay"    : "1990-01-01",
        #     "birthPlace"  : "Wales",
        #     "gender"      : "FEMALE",
        #     "name"        : "GuestDuyguJ",
        #     "password"    : "Project14",
        #     "phoneNumber" : "444-932-1901",
        #     "ssn"         : "823-10-7392",
        #     "surname"     : "Joneses",
        #     "username"    : "000GuestDuyguJ"
        #   }

        #  -------> GuestUser Get All Response Body for one 1
        #  {
        #            "id": ...,
        #            "username": "000GuestDuyguJ",
        #            "ssn": "823-10-7392",
        #            "name": "GuestDuyguJ",
        #            "surname": "Joneses",
        #            "birthDay": "1990-01-01",
        #            "birthPlace": "Wales",
        #            "phoneNumber": "444-932-1901",
        #            "gender": "FEMALE"
        #  },


        #  --------> Delete GuestUser Response body
        # {
        #     "message"     : " Guest User deleted Successful",
        #     "httpStatus"  : "OK"
        # }


