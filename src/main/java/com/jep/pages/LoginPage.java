package com.jep.pages;

import com.jep.util.WaitManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    WebDriver driver = null;

    @FindBy(xpath = "//input[@placeholder='Enter Username']")
    private WebElement usernameText;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    private WebElement passwordText;

    @FindBy(xpath = "//input[@name='insert']")
    private WebElement loginClick;

    @FindBy(xpath = " //span[normalize-space()='Personal List']")
    private WebElement personalListClick;

    @FindBy(xpath = " //span[normalize-space()='Personal']")
    private WebElement personalClick;

    @FindBy(xpath = "//input[@type='search']")
    private  WebElement searchText;

    @FindBy(xpath = "//label[normalize-space()='Invalid Username and Password']")
    private WebElement errorMessage;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean launchApplication() {
        openApplication(driver, "https://cpanel.dev.floatr.in/");
        driver.manage().window().maximize();
        return true;
    }

    public boolean userName(String userName) {
        setText(usernameText, driver, userName, 10);
        return true;
    }

    public boolean passwordName(String passwordName) {
        setText(passwordText, driver, passwordName, 10);
        return true;
    }

    public boolean loginButton() {
        buttonClick(loginClick, driver, 10);
        return true;
    }

    public boolean prsnlListClick() {
        buttonClick(personalListClick, driver, 10);
        return true;
    }

    public boolean prsnlClick() {
        buttonClick(personalClick, driver, 10);
        return true;
    }

    public boolean searchUser(String searchUser) {
        setText(searchText, driver, searchUser, 10);
        return true;
    }

    public boolean scroll(String scroll) {
        scrollDown(usernameText, driver, scroll, 10);
        return true;
    }

    public String getValidationError(String getValidationError){

        getText(errorMessage, driver, getValidationError);
        return "";
    }

}