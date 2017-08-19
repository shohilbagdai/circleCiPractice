package com.statravel.autoqa;

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.statravel.autoqa.commons.WebDriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author STA Development Team
 *
 */
public class Hooks {

    /**
     * Before each feature scenario starts the WebDriver.
     * @throws MalformedURLException 
     */
    @Before(order = 1)
    public void start() throws MalformedURLException {

        WebDriverFactory.initWebDriver();

    }

    /**
     * After each feature scenario shuts down the WebDriver.
     * 
     * @param scenario
     *            scenario
     */
    @After
    public void closeBrowser(final Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) WebDriverFactory.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        WebDriverFactory.quitWebDriver();
    }
}
