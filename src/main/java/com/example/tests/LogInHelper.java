package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInHelper extends HelperBase {

    public LogInHelper(ApplicationManager manager) {
        super(manager);
    }

    public void logIn(LoginData loginData) throws Exception {
        Thread.sleep(100);
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(loginData.login);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(loginData.password);
        driver.findElement(By.name("ready")).click();
    }



    public void logOut() throws Exception {
        if (isLoggedIn() == true) {
            driver.findElement(By.linkText("Выход")).click();
        }
    }

    public boolean isLoggedIn(LoginData loginData) {

        try {
            driver.findElement(By.linkText("Личный кабинет")).click();
            Thread.sleep(100);
            driver.findElement(By.id("ds")).click();
            Thread.sleep(100);
            driver.findElement(By.id("log-in")).getAttribute("value").equals(loginData.login);


            return true;

        } catch (NoSuchElementException e) {
            System.out.println("nse");
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }





    public boolean isLoggedIn() {
        try {
            driver.findElement(By.linkText("Выход"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
