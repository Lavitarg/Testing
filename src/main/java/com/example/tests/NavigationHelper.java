package com.example.tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase {

    public  String baseUrl;

    public NavigationHelper(ApplicationManager manager,String baseUrl ) {
        super(manager);
        this.baseUrl=baseUrl;
    }

    public void openSite() throws Exception {
        driver.get(baseUrl + "/index.php");
       // driver.findElement(By.linkText("Понятно")).click();
    }

    public void openNotes() throws Exception{
        driver.findElement(By.linkText("Заметки")).click();

    }

}
