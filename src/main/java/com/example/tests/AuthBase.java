package com.example.tests;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthBase extends TestBase {

    String login;
    LoginData loginData = new LoginData("sermarsel@mail.ru", "Boosters00", "Lavi") ;

    private  WebDriver driver;


    @Before
    public void loggingIn() throws Exception {

        app.getAuth().logIn(loginData);

    }
}

