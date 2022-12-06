package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;


public class VerifyMessagePage extends Utility {
    By userIdField = By.xpath("//input[@type='email']");
    By passwordField=By.xpath("//input[@type='password']");
    By signInField = By.xpath("//input[@value='Sign in']");
    By textMessage = By.xpath("//li[@role='alert']");


    public void enterUserIdField (String username){sendTextToElement(userIdField , username);}
    public void enterPasswordField (String password){sendTextToElement(passwordField,password);}
    public void clickOnSingIn(){clickOnElement(signInField);}
    public void verifyTextMessage(){verifyTextFromElements(textMessage,"Invalid email or password.");}


    }

