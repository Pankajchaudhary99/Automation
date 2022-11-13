Feature: Login Action
  Background: Launch Application & Login

    Given User is on Login Page
    When user logs in through Login Window by using <Username> as "admin"
    And user logs in through Login Window by using <Password> as "admin"
    And user click on Login button
    Then login must be successful

    Scenario: Personal List

      Given Click on Personal List
      When Personal should open

  Scenario: Personal

    Given Click on Personal List
    When Click on Personal
    Then Personal List should appear

    Scenario: Search Action

      Given Click on Personal List
      And Click on Personal
      And User is in search bar
      When The user enters <SearchValidUser> as "Pankaj" into the search bar
      Then Search user related details are shown on the results page

      Scenario: Search Invalid Action

        Given Click on Personal List
        And Click on Personal
        And User is in search bar
        But The user enters <SearchInvalidUser> as "@^&^&^&^&%" into the search bar
        Then No matching records found

      Scenario: Scroll Up Action

        Given Click on Personal List
        And Click on Personal
        When The user should Scroll down

  Scenario: Logging in with invalid credentials

    Given I am at the Login page
    When user logs in through Login Window by using <Username> as "amit"
    And user logs in through Login Window by using <Password> as "1234"
    And user click on Login button
    Then a text 'Invalid Username and Password' Should appear in the validation errors




