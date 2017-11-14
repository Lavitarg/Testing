package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ApplicationManager {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    private NavigationHelper navigation;
    private LogInHelper auth;
    private NoteHelper notes;
    private static ThreadLocal<ApplicationManager> app = new ThreadLocal<ApplicationManager>();

    public void Stop(){
        driver.quit();
    }


    public WebDriver getDriver() {
        return driver;
    }

    public NavigationHelper getNavigation() {
        return navigation;
    }

    public LogInHelper getAuth() {
        return auth;
    }

    public NoteHelper getNotes() {
        return notes;
    }
    public String getBaseUrl(){
        return baseUrl;
    }

    public ApplicationManager() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марс\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://listsend.ru";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        StringBuffer verificationErrors = new StringBuffer();
        navigation = new NavigationHelper(this, baseUrl);
        auth = new LogInHelper(this);
        notes = new NoteHelper(this);


    }

}
