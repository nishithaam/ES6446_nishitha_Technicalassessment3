
Feature: Providing required data for register using data Table
  
  Background: Given url to launch webpage
 
  @ValidCredentials
  Scenario: Register using valid credentials
    Given User clicking register button to enter credentials
    When User clicking radio button
    And User entering firstname,Lastname,email,password and also confirm password
    | FirstName      | LastName    |            Email              | Password       | Confirm Password |
    | nishitha       | murthy      |   nishithaam24@gmail.com      | Advaiths@1437  |  Advaiths@1437   |
      
    Then User clicks register button

 