package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.pages.VerifyMessagePage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    VerifyMessagePage verifyMessagePage =new VerifyMessagePage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        loginPage.clickOnSignInLink();
        loginPage.verifyTextMessage();

    }
    @Test
    public void verifyTheErrorMessage(){
        loginPage.clickOnSignInLink();
        verifyMessagePage.enterUserIdField("kishan_0204@yahoo.co.in");
        verifyMessagePage.enterPasswordField("Vivek241990");
        verifyMessagePage.clickOnSingIn();
        verifyMessagePage.verifyTextMessage();


    }


}