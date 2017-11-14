package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марс\\Downloads\\chromedriver_win32\\Chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http:///listsend.ru";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    public void logIn(LoginData loginData) throws Exception {
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(loginData.login);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(loginData.password);
        driver.findElement(By.name("ready")).click();
    }
    public void openNotes() throws Exception{
        driver.findElement(By.linkText("Заметки")).click();

    }

    public void newNote(NoteData noteData) throws Exception {
        driver.findElement(By.linkText("Создать блокнот")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("imya")).clear();
        driver.findElement(By.name("imya")).sendKeys(noteData.noteName);
        driver.findElement(By.linkText("Создать")).click();
        Thread.sleep(1000);
    }

    public void logOut() throws Exception{
        driver.findElement(By.linkText("Выход")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


}

