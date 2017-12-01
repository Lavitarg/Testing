package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public ApplicationManager app;


    @Before
    public void setUp() throws Exception {

        app = new ApplicationManager();
        app.getNavigation().openSite();
    }



    @After
    public void tearDown() throws Exception {
        app.Stop();

    }

}

