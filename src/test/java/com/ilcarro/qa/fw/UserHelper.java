package com.ilcarro.qa.fw;

import com.ilcarro.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn() throws InterruptedException {
        clickLoginTabOnHeader();
        pause(500);
        fillLoginForm(new User().withEmail("jj@uu122.com").withPassword("1Bbbbbccc"));
        submitForm();
    }

    public void fillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public void logOut() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void clickLoginTabOnHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void selectPolicyCheckBox() {
        click(By.cssSelector("#check_policy"));
    }

    public boolean isRegistrationFormOpened() {
        return isElementPresent(By.cssSelector("form.signup__fields"));
    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }
}
