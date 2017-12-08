package com.example.tests;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.gargoylesoftware.htmlunit.javascript.host.xml.XMLDocument;
import com.sun.deploy.xml.XMLNode;

import java.io.FileNotFoundException;

public  class Settings {

    public static String file = "Settings.xml";

    private static String login;
    private static String password;
    private static  String nickname;
    private static String baseURL;

    private static XMLDocument document;

   public static void  Settings(){

        try{
            XMLDocument document = new XMLDocument();
            document.load(file);
        }catch (Exception e){
            System.out.println("File not found");
        }

    }

    public static String getLogin() {
        //XMLNode node=document.2
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static String getNickname() {
        return nickname;
    }

    public static String getBaseURL() {
        return baseURL;
    }
}
