package com.ilcarro.qa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHelper extends HelperBase{

    public PageHelper(WebDriver wd) {
        super(wd);
    }

    public String getTextH2FromPage() { return getElementText(By.cssSelector("h2")); }

    public String getTextH3FromPage(){
        return getElementText(By.cssSelector("h3"));
    }




}
