package com.jep.pagefactory;

import com.jep.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    WebDriver driver=null;
    LoginPage loginPage=null;

    public PageObjectManager(WebDriver driver)
    {
        this.driver=driver;
    }

    public LoginPage getLoginPage()
    {
        loginPage= new LoginPage(driver);
        return loginPage;
    }


}
