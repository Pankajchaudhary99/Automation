package com.jep.util;

import com.jep.driver.WebDriverFactory;
import com.jep.pagefactory.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class TestContextSetup {

    public WebDriver driver= null;
    String browser;
    public Logger logger= Logger.getLogger(this.getClass().getName());
    public  PageObjectManager pageObjectManager;
    public TestContextSetup()
    {
        logger.info("TestContext Called=================>");
        if(driver==null)
        {
            driver= WebDriverFactory.getWebDriver("CHROME",false);
            logger.info("Driver Object Created ======>"+driver);
            pageObjectManager=new PageObjectManager(driver);

        }
    }

}
