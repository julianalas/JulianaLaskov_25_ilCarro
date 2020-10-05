package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @Test
    public void testSearch(){
        //click On Search button
        click(By.cssSelector("[class='header__nav desktop'] [href='/search']"));
        //check for header presence "Find your car now!"
        Assert.assertTrue(isElementPresent(By.cssSelector("h3")));
    }

    @Test
    public void testLetTheCatWork(){
        //click On LetTheCatWork button
        click(By.cssSelector("[class='header__nav desktop'] [href='/car']"));
        //check for header presence "Let the car work"
        Assert.assertTrue(isElementPresent(By.cssSelector("h3")));
    }

    @Test
    public void testSignUp(){
        //click On SignUp button
        click(By.cssSelector("[href='/signup']"));
        //check for header presence "Registration"
        Assert.assertTrue(isElementPresent(By.cssSelector("h2")));
    }

    @Test
    public void testLogIn(){
        //click On LogIn button
        click(By.cssSelector("[href='/login']"));
        //check for header presence "Log in"
        Assert.assertTrue(isElementPresent(By.cssSelector("h2")));
    }


}
