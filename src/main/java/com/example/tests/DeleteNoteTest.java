package com.example.tests;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteNoteTest extends TestBase {


    LoginData loginData = new LoginData("sermarsel@mail.ru", "Boosters00");
    NoteData noteData = new NoteData("testnote1", "Hello, world!", "3");

    @Test

    public void toDeleteNote() throws Exception {
        app.getNavigation().openSite();
        app.getAuth().logIn(loginData);
        app.getNavigation().openNotes();
        app.getNotes().deleteNote(noteData);
        app.getAuth().logOut();
    }
}
