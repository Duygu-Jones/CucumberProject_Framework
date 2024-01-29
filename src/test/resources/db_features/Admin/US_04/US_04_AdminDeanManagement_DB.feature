@DB_US04

  Feature: Verify Dean Information
    Scenario: Verify Registered Dean Information
      Given dj Connect to the Database
      Then dj Admin creates Expected Response Body for Get
      And dj send a Query to get the Dean GetManagerById
      And dj verify registered Dean information
      And Cut the connection

        # --> SQL Query : "SELECT * FROM dean WHERE username='jnsduygu'"

        #  -------> dean Table

        #                 "id"  : ........
        #                 "username": "jnsduygu",
        #                 "name"    : "Duygu",
        #                 "surname" : "Jones",
        #                 "birth_day": "1975-05-05",
        #                 "ssn"     : "568-72-9305",
        #                 "birth_place"  : "Izmir",
        #                 "phone_number" : "555-275-8196",
        #                 "gender"      : "FEMALE" -1 / MALE: 0