package com.spartaglobal.bbcregistration;

import com.spartaglobal.bbcregistration.bbcwebsite.BbcWebsite;
import com.spartaglobal.bbcregistration.bbcwebsite.seleniumconfig.SeleniumConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BbcWebsite bbcWebsite = new BbcWebsite(new SeleniumConfig("chrome").getDriver());
        bbcWebsite.homePage().goToHomePage();
        bbcWebsite.homePage().clickSignInLink();
        bbcWebsite.loginPage().clickRegisterNowButton();
        bbcWebsite.registrationPage().clickOver13Years().enterDate("23").enterMonth("12").enterYear("1990").clickSubmitButton();
        bbcWebsite.registrationPage().enterEmail("tobyg7794@gmail.com").enterPassword("gfd");
        bbcWebsite.registrationPage().clickRegister().getErrorMessage();
    }
}
