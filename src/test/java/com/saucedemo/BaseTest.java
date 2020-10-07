package com.saucedemo;
//
//import com.saucelabs.saucebindings.SauceOptions;
//import com.saucelabs.saucebindings.SauceSession;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    //We need to create a ThreadLocal object to be accessed by a specific thread
    public static WebDriver driver;

    @BeforeMethod
    public void setup(Method method) {
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/saucedemo/drivers/chromedriver");
        driver = new ChromeDriver();*/

        driver = new SafariDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
        driver = null;
    }
}

