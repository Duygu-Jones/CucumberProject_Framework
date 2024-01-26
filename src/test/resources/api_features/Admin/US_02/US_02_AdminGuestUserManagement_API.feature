@API_US02

Feature: US02 GuestUser Management by the Admin

  #-----> Admin GuestUser olusturamiyor sadece Get ve Delete yapabilir
#  Scenario: US02_TC01 Admin sends POST Request to Add GuestUser to the website api
#    Given Login as "Admin"
#    Then dj Admin creates POST Request with the URL and "guestUser/register" path parameters for guestUser
#    Then dj Admin creates POST Request Body for guestUser
#    And dj Admin sends POST request and saves the response for guestUser
#    And dj Admin creates Expected Response Body for guestUser
#    And dj Admin verifies Status-Code is 200 for guestUser
#    And dj Admin verifies Content-Type is "application/json" for guestUser
#    And dj Admin verifies POST Response Body as expected for guestUser


  Scenario: US04_TC02 Admin sends GET request to get AGuestUser information from the website api
    Given Login as "Admin"
    Then dj Admin creates GET Request with the URL and guestUser-userID path parameters for guestUser
    And dj Admin sends GET Request and saves the response for guestUser
    Then dj Admin creates Expected Response Body for guestUser
    And dj Admin verifies Status-Code 200 for guestUser
    And dj Admin verifies Content-Type is "application/json" for guestUser
    And dj Admin verifies GET Response Body as expected for guestUser


  Scenario: US04_TC03 Admin send DELETE Request to delete GuestUser from the website api
    Given Login as "Admin"
    Then dj Admin creates DELETE Request with the URL and guestUser-delete-userID path parameters for guestUser
    Then dj Admin verifies Status-Code 200 for guestUser
    And dj Admin verifies Content-Type is "application/json" for guestUser
    And dj Admin verifies DELETE Response Body as expected for guestUser


        #   OK          : 200
        #   Created     : 201
        #   Error / Unauthorized : 401
        #   Forbidden   : 403
        #   Not Found   : 404

        #  --------> GuestUser Request Body
        #   {
        #     "birthDay"    : "01-01-1990",
        #     "birthPlace"  : "Wales",
        #     "gender"      : "MALE",
        #     "name"        : "Jhoseph",
        #     "password"    : "Project14",
        #     "phoneNumber" : "504-235-6532",
        #     "ssn"         : "120-42-6432",
        #     "surname"     : "Parkman",
        #     "username"    : "GuestUserTeam05"
        #   }

        #  -------> GuestUser Response Body
        #  {
        #    "httpStatus"   : "100 CONTINUE",
        #    "message"      : "string",
        #    "object"       : {
        #      "birthDay"   : "string",
        #      "birthPlace" : "string",
        #      "gender"     : "MALE",
        #      "name"       : "string",
        #      "phoneNumber": "string",
        #      "ssn"        : "string",
        #      "surname"    : "string",
        #      "userId"     : 0,
        #      "username"   : "string"
        #    }
        #  }

        #  --------> Delete response body
        # {
        #     "message"     : "Dean Deleted",
        #     "httpStatus"  : "OK"
        # }
