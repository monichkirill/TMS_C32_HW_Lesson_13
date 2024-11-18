package com.teachmeskills.service;

import com.teachmeskills.exceptions.WrongLoginException;
import com.teachmeskills.validator.LoginValidator;

import java.util.Scanner;

public class LoginCheck {
    public static void loginCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input login: ");
        String login = scanner.nextLine();

        try {
            LoginValidator.validateLogin(login);
            System.out.println("Success");
        } catch (WrongLoginException e) {
            System.out.println("Login verification error: " + e.getMessage());
        }
    }
}
