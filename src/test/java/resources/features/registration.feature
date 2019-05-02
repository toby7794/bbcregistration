Feature: Registration
  As a user I would like to register to the bbc website

  Scenario Outline: I am able to check all password errors in the registration process
    Given I am over 13 years old
    And I have a date of birth
    And I have a valid email
    When I input an invalid password <password>
    And I click the register button
    Then I recieve the password error message <message>

    Examples:

    |  password |                                  message                                          |
    |  "abc"    | "Sorry, that password is too short. It needs to be eight characters or more."     |
    |"123456789"| "Sorry, that password isn't valid. Please include a letter."                      |
    |"abdghyskw"| "Sorry, that password isn't valid. Please include something that isn't a letter." |
    |    ""     | "Something's missing. Please check and try again."                                |



