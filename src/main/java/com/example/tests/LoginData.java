package com.example.tests;

public class LoginData {

    public String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public LoginData(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
