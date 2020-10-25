package com.ilcarro.qa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterHelper extends HelperBase{

    public FooterHelper(WebDriver wd) {
        super(wd);
    }


    public void clickOnSearchButtonFromFooter() {
        click(By.cssSelector("[class='footer__nav'] [href='/search']"));
    }

    public void clickOnLetTheCatWorkButtonFromFooter(){
        click(By.cssSelector("[class='footer__nav'] [href='/car']"));
    }

}
