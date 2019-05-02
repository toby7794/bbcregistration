$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/TGoddard/IdeaProjects/bbcregistration/src/test/java/resources/features/registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "  As a user I would like to register to the bbc website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "I am able to check all password errors in the registration process",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am over 13 years old",
  "keyword": "Given "
});
formatter.step({
  "name": "I have a date of birth",
  "keyword": "And "
});
formatter.step({
  "name": "I have a valid email",
  "keyword": "And "
});
formatter.step({
  "name": "I input an invalid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click the register button",
  "keyword": "And "
});
formatter.step({
  "name": "I recieve the password error message \u003cmessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password",
        "message"
      ]
    },
    {
      "cells": [
        "\"abc\"",
        "\"Sorry, that password is too short. It needs to be eight characters or more.\""
      ]
    },
    {
      "cells": [
        "\"123456789\"",
        "\"Sorry, that password isn\u0027t valid. Please include a letter.\""
      ]
    },
    {
      "cells": [
        "\"abdghyskw\"",
        "\"Sorry, that password isn\u0027t valid. Please include something that isn\u0027t a letter.\""
      ]
    },
    {
      "cells": [
        "\"\"",
        "\"Something\u0027s missing. Please check and try again.\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "I am able to check all password errors in the registration process",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am over 13 years old",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefs.i_am_over_years_old(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a valid email",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input an invalid password \"abc\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_click_the_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I recieve the password error message \"Sorry, that password is too short. It needs to be eight characters or more.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.i_recieve_the_password_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "I am able to check all password errors in the registration process",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am over 13 years old",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefs.i_am_over_years_old(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a valid email",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input an invalid password \"123456789\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_click_the_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I recieve the password error message \"Sorry, that password isn\u0027t valid. Please include a letter.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.i_recieve_the_password_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "I am able to check all password errors in the registration process",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am over 13 years old",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefs.i_am_over_years_old(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a valid email",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input an invalid password \"abdghyskw\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_click_the_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I recieve the password error message \"Sorry, that password isn\u0027t valid. Please include something that isn\u0027t a letter.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.i_recieve_the_password_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "I am able to check all password errors in the registration process",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am over 13 years old",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefs.i_am_over_years_old(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a valid email",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_have_a_valid_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input an invalid password \"\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.i_click_the_register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I recieve the password error message \"Something\u0027s missing. Please check and try again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.i_recieve_the_password_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
});