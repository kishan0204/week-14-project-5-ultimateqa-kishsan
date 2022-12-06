package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {

    By signInLink = By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");
    By textMessage = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public void clickOnSignInLink(){clickOnElement(signInLink);}
    public void verifyTextMessage(){verifyTextFromElements(textMessage,"Welcome Back!");}

}
