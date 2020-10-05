package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void ensurePreconditions(){
        //goTo ligin page
        if(!isLoginFormPresent()){
            click(By.cssSelector("[href='/login']"));
        }
    }

    @Test
    public void loginRegisteredUserPositeveTest(){
        //jj@uu110.com
        //jj@uu111.com



        // fill Login form
        type(By.name("email"), "jj@uu110.com");
        type(By.name("password"), "1Bbbbbbbbbb");

        wd.findElement(By.cssSelector("")).click();
        wd.findElement(By.cssSelector("")).clear();
        wd.findElement(By.cssSelector("")).sendKeys();

        //submit login
       submitForm();


        //Assert userLoggedIn
    }

}
