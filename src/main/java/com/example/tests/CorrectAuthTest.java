package com.example.tests;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectAuthTest extends TestBase {

    LoginData loginData = new LoginData("sermarsel@mail.ru", "Password1234", "Lavi" );

 /*   @Test

    public void doAuthTest1() throws Exception {

        app.getAuth().logOut();

        app.getAuth().logIn(loginData);

        Assert.assertTrue(app.getAuth().isLoggedIn());

    }
*/
    @Test

    public void doAuthTest2 () throws Exception{

        app.getAuth().logOut();

        Assert.assertTrue(app.getAuth().isLoggedIn(loginData));

    }

}
