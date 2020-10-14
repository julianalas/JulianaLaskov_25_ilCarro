package com.ilcarro.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        //goTo ligin page
        if(!app.getCar().isLoginFormPresent()){
            //if user logged in, click logout, go to login
            if(app.getUser().isUserLoggedIn()){
                app.getUser().logOut();
            }
            app.getUser().clickLoginTabOnHeader();
        }

    }

    @Test
    public void loginRegisteredUserPositiveTest()throws InterruptedException {

        app.getUser().logIn();

        Assert.assertTrue(app.getUser().isUserLoggedIn());
        String email = app.getHeader().getEmailTextFromHeader();
        System.out.println(email);
        Assert.assertEquals(email,"jj@uu122.com" );

    }


}
