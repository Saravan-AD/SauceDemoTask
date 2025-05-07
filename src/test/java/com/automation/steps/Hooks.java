package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Hooks {

    @Before
    public void setUp() {
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }

//    @AfterStep
//    public void afterStep() {
//        // this function will return Boolean.TRUE only once the 1 000 ms timeout has elapsed
//        new WebDriverWait(DriverManager.getDriver(), Duration.ofMillis(1000))
//                .until(new Function<WebDriver, Boolean>() {
//                    private long start = System.currentTimeMillis();
//                    @Override
//                    public Boolean apply(WebDriver driver) {
//                        return System.currentTimeMillis() - start >= 500;
//                    }
//                });
//    }


    @After
    public void cleanUp(Scenario scenario) {
        scenario.attach(DriverManager.takeScreenshotAsInputStream(), "image/png", "screenshot");
        DriverManager.getDriver().quit();
    }
}