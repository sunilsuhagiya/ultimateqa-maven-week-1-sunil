package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signInPage = By.xpath("//a[@href='/users/sign_in']");
    By textMessage = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By userNameField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By loginButton = By.xpath("//input[@type='submit']");


    By theErrorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void clickOnSignInLink() {
        clickOnElement(signInPage);
    }

    public String getTextMessage() {
        return getTextFromElement(textMessage);
    }

    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getUserNameErrorMessage() {
        return getTextFromElement(theErrorMessage);
    }

}
