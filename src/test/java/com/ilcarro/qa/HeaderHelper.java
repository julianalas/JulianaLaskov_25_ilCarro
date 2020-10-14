package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public String getEmailTextFromHeader() {
        return getElementText(By.cssSelector("[href='/account']"));
    }

    public boolean isSignUpTabPresentInHeader() {
        return isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void openRegistrationFormFromHeader() {
        click(By.cssSelector("[href='/signup']"));
    }


    public void clickOnSearchButtonFromHeader() {
        click(By.cssSelector("[class='header__nav desktop'] [href='/search']"));
    }


    public void clickOnLetTheCatWorkButtonFromHeader(){
        click(By.cssSelector("[class='header__nav desktop'] [href='/car']"));
    }



}
