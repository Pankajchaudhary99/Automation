package com.jep.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManagement {
    public static final int WAIT_FIVE_SECOND=5;
    public static void waitForElementToClickable(WebDriver driver, WebElement we, int wait)
    {
        WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(wait));
        wt.until(ExpectedConditions.elementToBeClickable(we));
    }
    public static void waitForElementToVisible(WebDriver driver, WebElement we, int wait)
    {
        WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(wait));
        wt.until(ExpectedConditions.visibilityOf(we));
    }
    public void holdOnProcess(int wait)
    {
        try
        {
            Thread.sleep(wait);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
