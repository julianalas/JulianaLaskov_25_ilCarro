package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{

    @Test
    public void testSearch(){
        //click On Search button
        wd.findElement(By.cssSelector("[class='header__nav desktop'] [href='/search']")).click();
        //check for header presence "Find your car now!"
        Assert.assertTrue(isElementPresent(By.cssSelector("h3")));
    }

    @Test
    public void testLetTheCatWork(){
        //click On LetTheCatWork button
        wd.findElement(By.cssSelector("[class='header__nav desktop'] [href='/car']")).click();
        //check for header presence "Let the car work"
        Assert.assertTrue(isElementPresent(By.cssSelector("h3")));
    }

    @Test
    public void testSignUp(){
        //click On SignUp button
        wd.findElement(By.cssSelector("[href='/signup']")).click();
        //check for header presence "Registration"
        Assert.assertTrue(isElementPresent(By.cssSelector("h2")));
    }

    @Test
    public void testLogIn(){
        //click On LogIn button
        wd.findElement(By.cssSelector("[href='/login']")).click();
        //check for header presence "Log in"
        Assert.assertTrue(isElementPresent(By.cssSelector("h2")));
    }


}
