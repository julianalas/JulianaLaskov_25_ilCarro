package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTests extends TestBase{

    @Test
    public void testSearch(){
        //click On Search button
        click(By.cssSelector("[class='footer__nav'] [href='/search']"));
        //check for header presence "Find your car now!"
        Assert.assertTrue(isElementPresent(By.cssSelector("h3")));
    }

    @Test
    public void testLetTheCatWork(){
        //click On LetTheCatWork button
        wd.findElement(By.cssSelector("[class='footer__nav'] [href='/car']")).click();
        //check for header presence "Let the car work"
        Assert.assertTrue(isElementPresent(By.cssSelector("h3")));
    }
}
