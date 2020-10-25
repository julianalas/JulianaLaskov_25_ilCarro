package com.ilcarro.qa.tests;

import com.ilcarro.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    //preconditions: user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if(!app.getHeader().isSignUpTabPresentInHeader()){  //Sign Up not present
            app.getUser().logOut();
        }
    }

    @Test
    public void testSignUp() throws InterruptedException {
        // click On SignUp button
        app.getHeader().openRegistrationFormFromHeader();
        Assert.assertTrue(app.getUser().isRegistrationFormOpened());
        app.getUser().fillRegistrationForm(
                new User()
                        .withFirstName("AB")
                        .withSecondName("CD")
                        .withEmail("jj@uu123.com")
                        .withPassword("1Bbbbbccc"));

        app.getUser().selectPolicyCheckBox();
        app.getCar().pause(2000);
        app.getCar().submitForm();   //click submit button (Y'alla!)
        Assert.assertTrue(app.getCar().isLoginFormPresent());    //check, login form displayed

    }

    @Test
    public void negativeTestSignUpWithoutPassword() throws InterruptedException {
        // click On SignUp button
        app.getHeader().openRegistrationFormFromHeader();
        Assert.assertTrue(app.getUser().isRegistrationFormOpened());
        app.getUser().fillRegistrationForm(
                new User()
                        .withFirstName("Ben")
                        .withSecondName("Afflec")
                        .withEmail("ben.aff@gmail.com"));

        app.getUser().selectPolicyCheckBox();
        app.getCar().pause(2000);
        app.getCar().submitForm();   //click submit button (Y'alla!)
        Assert.assertFalse(app.getCar().isLoginFormPresent());    //check, login form displayed

    }


}
