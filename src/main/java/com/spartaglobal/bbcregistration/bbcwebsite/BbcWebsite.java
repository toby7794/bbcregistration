package com.spartaglobal.bbcregistration.bbcwebsite;

import com.spartaglobal.bbcregistration.bbcwebsite.bbcpageobject.LoginPage;
import com.spartaglobal.bbcregistration.bbcwebsite.bbcpageobject.RegistrationPage;
import org.openqa.selenium.WebDriver;
import com.spartaglobal.bbcregistration.bbcwebsite.bbcpageobject.HomePage;

public class BbcWebsite {

    private WebDriver driver;

    public BbcWebsite(WebDriver driver){this.driver = driver;}

    public HomePage homePage(){
        return new HomePage(driver);
    }

    public LoginPage loginPage(){
        return new LoginPage(driver);
    }

    public RegistrationPage registrationPage(){
        return new RegistrationPage(driver);
    }

    public void quitDriver(){
        driver.quit();
    }
}
