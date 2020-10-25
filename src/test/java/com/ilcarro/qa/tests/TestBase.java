package com.ilcarro.qa.tests;

import com.ilcarro.qa.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp(){
        app.init();
    }

    @AfterSuite(enabled = false)
    public void tearDown(){
        app.stop();
    }


}
