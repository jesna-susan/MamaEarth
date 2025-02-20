Feature: Address Adding Functionality

  Scenario: verify user can add address
    Given user opens the website
    Then verify user is on home page
    When user clicks on login icon
    Then verify user is on login page
    When user enters valid phone number "login.phone"
    And clicks on login with otp
    Then user should be redirected to the OTP details page
    When user enter otp and click on submit button
    Then verify user phone number is present in login page
    When selects manage address option
    Then verify user is on address page
    When user clicks on + add address button
    And verify user is on address filling page
    When user fills address details
    And selects address type as "home"
    And clicks on save address button
    Then verify address is added

