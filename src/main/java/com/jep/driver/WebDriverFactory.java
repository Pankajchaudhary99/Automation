package com.jep.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverFactory {

    public static WebDriver getWebDriver(String browserName,boolean isOption)
    {
        WebDriver driver =null;

        ChromeOptions cs = new ChromeOptions();
        cs.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        cs.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        switch (browserName)
        {
            case "CHROME" :
                WebDriverManager.chromedriver().setup();
                if(isOption)
                {
                    driver= new ChromeDriver(getChromeOption());
                }
                else
                {
                    driver = new ChromeDriver(cs);
                }
                break;
            case "FIREFOX" :
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();

        }
        return driver;

    }
    /*
    this method use to set the ChromeOption value
     */
    public static ChromeOptions getChromeOption()
    {
        ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--headless");
        return opt;
    }
}
