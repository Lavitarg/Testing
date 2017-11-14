package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInHelper extends HelperBase {

    public LogInHelper(ApplicationManager manager){
        super(manager);
    }

    public void logIn(LoginData loginData) throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(loginData.login);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(loginData.password);
        driver.findElement(By.name("ready")).click();
    }

    public void logOut() throws Exception{
        driver.findElement(By.linkText("Выход")).click();

    }


}
