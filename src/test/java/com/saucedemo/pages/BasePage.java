package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //We need to create a ThreadLocal object to be accessed by a specific thread
    protected WebDriver driver = null;
    public String baseUrl;
    public WebDriverWait pageWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        pageWait = new WebDriverWait(driver, 10);
        baseUrl = "https://www.saucedemo.com";
    }
}
