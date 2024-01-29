@DB_US02

Feature: Verify GuestUser Information
  Scenario: Verify Registered GuestUser Information
    Given dj Connect to the Database for GuestUser
    Then dj Admin creates Expected Response Body for guestUser
    And dj send a Query to get the GuestUser GetManagerById
    And dj verify registered GuestUser information
    And Cut the connection for GuestUser


  #---> sql Query: "SELECT * FROM guest_user WHERE username='000GuestDuyguJ'"

      #  -------> guest_user Table
        #  "id": ...,
        #  "username": "GuestUserDuyguJ",
        #  "ssn": "823-10-7392",
        #  "name": "GuestDuyguJ",
        #  "surname": "Joneses",
        #  "birth_day": "1990-01-01",
        #  "birth_place": "Wales",
        #  "phone_number": "444-932-1901",
        #  "gender": "FEMALE" -1 / MALE: 0