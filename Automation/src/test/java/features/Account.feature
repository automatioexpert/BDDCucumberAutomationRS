Feature: Application login2

  Background: 
    Given validate the browser
    When browser is triggered
    Then check if browser is launched

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User log into the application with "user1" and "password1"
    Then Home page is populated
    And Cards are displayed are "true"

  @RegTest
  Scenario: Home page default login2
    Given User is on NetBanking landing page
    When User log into the application with "user2" and "password2"
    Then Home page is populated
    And Cards are displayed are "false"

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd   | abcd@gmail.com   | Australia |
      | VV    | abcd78 | abcd78@gmail.com | India     |

  #Then Home Page is displayed
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User log into the application with <username> and <password>

    Examples: 
      | username | password  |
      | user1    | password1 |
      | user2    | password2 |
