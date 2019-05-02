package com.spartaglobal.bbcregistration.stepdefs;

import com.spartaglobal.bbcregistration.bbcwebsite.BbcWebsite;
import com.spartaglobal.bbcregistration.bbcwebsite.seleniumconfig.SeleniumConfig;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefs {

    private BbcWebsite bbcWebsite = new BbcWebsite(new SeleniumConfig("chrome").getDriver());

    @Given("I am over {int} years old")
    public void i_am_over_years_old(Integer int1) {
        bbcWebsite.homePage().goToHomePage();
        bbcWebsite.homePage().clickSignInLink();
        bbcWebsite.loginPage().clickRegisterNowButton();
        bbcWebsite.registrationPage().clickOver13Years();
    }

    @And("I have a date of birth")
    public void i_have_a_date_of_birth() {
        bbcWebsite.registrationPage().enterDate("11").enterMonth("12").enterYear("1990").clickSubmitButton();
    }

    @And("I have a valid email")
    public void i_have_a_valid_email() {
        bbcWebsite.registrationPage().enterEmail("tobyg7794@gmail.com");
    }

    @When("I input an invalid {string}")
    public void i_input_an_invalid(String string) {
        bbcWebsite.registrationPage().enterPassword(string);

    }

    @And("I click the register button")
    public void i_click_the_register_button() {
        bbcWebsite.registrationPage().clickRegister();
    }

    @Then("I recieve the password error message {string}")
    public void i_recieve_the_password_error_message(String string) {
        Assert.assertEquals(bbcWebsite.registrationPage().getErrorMessage(),string);
    }

}
