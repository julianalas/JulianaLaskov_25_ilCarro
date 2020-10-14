package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTests extends TestBase{

    @Test
    public void testSearch(){
        //click On Search button
        app.getFooter().clickOnSearchButtonFromFooter();
        //check for header presence "Find your car now!"
        String textFromPage1 = app.getPage().getTextH3FromPage();
        System.out.println(textFromPage1);
        Assert.assertEquals(textFromPage1, "Find your car now!");
    }

    @Test
    public void testLetTheCatWork(){
        //click On LetTheCatWork button
        app.getFooter().clickOnLetTheCatWorkButtonFromFooter();
        //check for header presence "Let the car work"
        String textFromPage2 = app.getPage().getTextH3FromPage();
        System.out.println(textFromPage2);
        Assert.assertEquals(textFromPage2, "Let the car work");
    }
}
