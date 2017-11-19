package com.example.tests;

public class NoteData {

    public String noteName;

    public String noteDescription;

    public String noteNumber;


    public NoteData(String noteName, String noteDescription, String noteNumber) {
        this.noteName = noteName;
        this.noteDescription = noteDescription;
        this.noteNumber = noteNumber;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public String getNoteNumber() {
        return noteNumber;
    }

    public void setNoteNumber(String noteNumber) {
        this.noteNumber = noteNumber;
    }



}
