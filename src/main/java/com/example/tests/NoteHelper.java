package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoteHelper extends HelperBase {

    public NoteHelper(ApplicationManager manager) {
        super(manager);
    }

    public void newNote(NoteData noteData) throws Exception {
        driver.findElement(By.linkText("Создать блокнот")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("imya")).clear();
        driver.findElement(By.name("imya")).sendKeys(noteData.noteName);
        driver.findElement(By.linkText("Создать")).click();
        Thread.sleep(1000);
    }
}
