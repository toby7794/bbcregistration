package com.spartaglobal.bbcregistration.bbcwebsite.bbcpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private String signInPageURL = "https://account.bbc.com/signin";
    private By userField = By.id("user-identifier-input");
    private By passWordField = By.id("password-input");
    private By signinButtonId = By.id("submit-button");
    private By incorrectEmailErrorMessage = By.className("form-message__text");
    private By incorrectPasswordErrorMessage = By.className("form-message__text");
    private By registerNowButton = By.linkText("Register now");

    private By over13Button = By.linkText("13 or over");
    private By enterDateOfBirth = By.id("day-input");
    private By enterMonthOfBirth = By.id("month-input");
    private By enterYearOfBirth = By.id("year-input");
    private By clickEnterOnBirth = By.id("submit-button");


    public LoginPage(WebDriver driver){this.driver = driver;}

    public WebElement findElement(By element){return driver.findElement(element);}

    public void goToSignInPage(){driver.navigate().to(signInPageURL);}

    public LoginPage inputUserName(String userName){findElement(userField).sendKeys(userName); return this;}

    public LoginPage inputPassWord(String passWord){findElement(passWordField).sendKeys(passWord); return this;}

    public LoginPage clickSignInButton(){
        findElement(signinButtonId).click();
        return this;
    }

    public String getIncorrectEmailErrorText(){
        return findElement(incorrectEmailErrorMessage).getText();
    }

    public String getIncorrectPasswordErrorText(){
        return findElement(incorrectPasswordErrorMessage).getText();
    }




    public LoginPage clickRegisterNowButton(){
        findElement(registerNowButton).click();
        return this;
    }

    public LoginPage clickOver13Years(){
        findElement(over13Button).click();
        return this;
    }

    public LoginPage enterDate(String number){
        findElement(enterDateOfBirth).sendKeys(number);
        return this;
    }

    public LoginPage enterMonth(String number){
        findElement(enterMonthOfBirth).sendKeys(number);
        return this;
    }

    public LoginPage enterYear(String number){
        findElement(enterYearOfBirth).sendKeys(number);
        return this;
    }

    public LoginPage clickSubmitButton(){
        findElement(clickEnterOnBirth).click();
        return this;
    }
}


