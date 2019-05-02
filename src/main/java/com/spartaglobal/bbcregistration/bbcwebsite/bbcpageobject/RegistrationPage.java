package com.spartaglobal.bbcregistration.bbcwebsite.bbcpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    private WebDriver driver;
    private String registerPageURL = "https://account.bbc.com/register";
    private By over13Button = By.linkText("13 or over");
    private By enterDateOfBirth = By.id("day-input");
    private By enterMonthOfBirth = By.id("month-input");
    private By enterYearOfBirth = By.id("year-input");
    private By clickEnterOnBirth = By.id("submit-button");
    private By enterEmail = By.id("user-identifier-input");
    private By enterPassword = By.id("password-input");
    private By clickRegister = By.id("submit-button");
    private By errorMessage = By.className("form-message__text");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By element){return driver.findElement(element);}

    public void goToRegistrationPage(){driver.navigate().to(registerPageURL);}

    public RegistrationPage clickOver13Years(){
        findElement(over13Button).click();
        return this;
    }

    public RegistrationPage enterDate(String number){
        findElement(enterDateOfBirth).sendKeys(number);
        return this;
    }

    public RegistrationPage enterMonth(String number){
        findElement(enterMonthOfBirth).sendKeys(number);
        return this;
    }

    public RegistrationPage enterYear(String number){
        findElement(enterYearOfBirth).sendKeys(number);
        return this;
    }

    public RegistrationPage clickSubmitButton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(clickEnterOnBirth).click();
        return this;
    }

    public RegistrationPage enterEmail(String email){
        findElement(enterEmail).sendKeys(email);
        return this;
    }

    public RegistrationPage enterPassword(String passWord){
        findElement(enterPassword).sendKeys(passWord);
        return this;
    }

    public RegistrationPage clickRegister(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(clickRegister).click();
        return this;
    }

    public String getErrorMessage(){
        return findElement(errorMessage).getText();
    }


}
