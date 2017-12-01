package com.example.tests;

public class LoginData {

    public String login;

    public String nickname;
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


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


    public LoginData(String login, String password, String nickname) {
        this.login = login;
        this.password = password;
        this.nickname= nickname;

    }

}
