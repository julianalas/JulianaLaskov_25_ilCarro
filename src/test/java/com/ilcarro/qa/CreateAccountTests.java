package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    //preconditions: user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if(!isElementPresent(By.cssSelector("[href='/signup']"))){  //Sign Up not present
            click(By.xpath("//a[contains(., 'logOut')]"));
        }
    }

    @Test
    public void testSignUp(){

        // click On SignUp button
        click(By.cssSelector("[href='/signup']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        //fill registration form
        type(By.cssSelector("#first_name"), "AB");
        type(By.cssSelector("#second_name"), "CD");
        type(By.cssSelector("#email"), "jj@uu112.com");
        type(By.cssSelector("#password"), "1Bbbbbbbbbb");

        click(By.cssSelector("#check_policy"));

        //click submit button (Y'alla!)
        submitForm();

        //check, login form displayed
        Assert.assertTrue(isLoginFormPresent());

    }




}
