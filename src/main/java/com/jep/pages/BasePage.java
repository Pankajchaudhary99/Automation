package com.jep.pages;

import com.jep.util.WaitManagement;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class BasePage {

    public Logger logger = Logger.getLogger(Logger.getLogger(this.getClass()).getName());

    public void buttonClick(WebElement we, WebDriver driver,int...wait)
    {
        if(wait.length>0) {
            WaitManagement.waitForElementToVisible(driver, we, wait[0]);
            WaitManagement.waitForElementToClickable(driver, we, wait[0]);
        }

        we.click();
    }

    public void setText(WebElement we, WebDriver driver,String text,int...wait)
    {
        if(wait.length>0) {
            WaitManagement.waitForElementToVisible(driver, we, wait[0]);
        }
        we.sendKeys(text);
    }
    public void openApplication(WebDriver driver,String url)
    {
        driver.get(url);
        logger.info("Application up ====>"+url);
    }

    public void scrollDown(WebElement we, WebDriver driver,String text,int...wait){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scroll(0, 1000)");
    }

    public void getText(WebElement we, WebDriver driver,String text,int...wait){


    }

}