package com.example.tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCreateNote extends TestBase {

    LoginData loginData = new LoginData("sermarsel@mail.ru", "Boosters00");
    NoteData noteData = new NoteData("testnote1", "Hello, world!");

    @Test

    public void toCreateNote() throws Exception {
        app.getNavigation().openSite();
        app.getAuth().logIn(loginData);
        app.getNavigation().openNotes();
        app.getNotes().newNote(noteData);
        app.getAuth().logOut();
    }
}
