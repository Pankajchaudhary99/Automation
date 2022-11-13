package com.jep.stepdefination;

import com.jep.util.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hook {

     TestContextSetup testContextSetup;
     WebDriver driver;
     public org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(org.apache.log4j.Logger.getLogger(this.getClass()).getName());
     public Hook(TestContextSetup testContextSetup)
     {
         this.testContextSetup=testContextSetup;
         driver=this.testContextSetup.driver;
     }

    @AfterStep
    public void after_step_execution(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
            logger.info("Test Step Failed ====================>");
            File spath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileCOntent= FileUtils.readFileToByteArray(spath);
            scenario.attach(fileCOntent,"image/png","image");
        }

    }

    @Before
    public void before_scenario(){


    }

    @After
    public void after_scenario()
    {
        System.out.println("Driver Closed ");
       driver.close();
    }

}
