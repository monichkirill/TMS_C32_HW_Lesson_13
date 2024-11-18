package com.teachmeskills.auth;

public class Auth {
    private String login;
    private String password;
    private String confirmPassword;

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


}
