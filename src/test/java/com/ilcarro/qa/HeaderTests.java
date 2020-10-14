package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @Test
    public void testSearch(){
        //click On Search button
        app.getHeader().clickOnSearchButtonFromHeader();
        //check for header presence "Find your car now!"
        String textFromPage1 = app.getPage().getTextH3FromPage();
        System.out.println(textFromPage1);
        Assert.assertEquals(textFromPage1, "Find your car now!");
    }

    @Test
    public void testLetTheCatWork(){
        //click On LetTheCatWork button
        app.getHeader().clickOnLetTheCatWorkButtonFromHeader();
        //check for header presence "Let the car work"
        String textFromPage2 = app.getPage().getTextH3FromPage();
        System.out.println(textFromPage2);
        Assert.assertEquals(textFromPage2, "Let the car work");
    }

    @Test
    public void testSignUp(){
        //click On SignUp button
        app.getHeader().openRegistrationFormFromHeader();
        //check for header presence "Registration"
        String tabName1 = app.getPage().getTextH2FromPage();
        System.out.println(tabName1);
        Assert.assertEquals(tabName1, "Registration");
    }

    @Test
    public void testLogIn(){
        //click On LogIn button
        app.getUser().clickLoginTabOnHeader();
        //check for header presence "Log in"
        String tabName2 = app.getPage().getTextH2FromPage();
        System.out.println(tabName2);
        Assert.assertEquals(tabName2, "Log in");
    }


}
