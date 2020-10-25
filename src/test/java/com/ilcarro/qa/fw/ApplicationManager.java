package com.ilcarro.qa.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    UserHelper user;
    CarHelper car;
    HeaderHelper header;
    FooterHelper footer;
    PageHelper page;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX))  {
            wd = new FirefoxDriver();
        } else if(browser.equals(BrowserType.EDGE)){
            wd = new EdgeDriver();
        } else if(browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

        user = new UserHelper(wd);
        car = new CarHelper(wd);
        header = new HeaderHelper(wd);
        footer = new FooterHelper(wd);
        page = new PageHelper(wd);

    }

    public void stop() {
        wd.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public CarHelper getCar() {
        return car;
    }

    public HeaderHelper getHeader() {
        return header;
    }

    public FooterHelper getFooter() {
        return footer;
    }

    public PageHelper getPage() {
        return page;
    }


}
