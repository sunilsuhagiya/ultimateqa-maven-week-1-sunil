package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.getTextMessage(), expectedMessage, "Welcome Back! not displayed");
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.clickOnSignInLink();
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getUserNameErrorMessage(), expectedMessage, "Invalid email or password not displayed");

    }
}
