package com.teachmeskills.service;

import com.teachmeskills.exceptions.WrongPasswordException;
import com.teachmeskills.validator.PasswordValidator;

import java.util.Scanner;

public class PasswordCheck {
    public static void passwordCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            PasswordValidator.validatePassword(password, confirmPassword);
            System.out.println("Password verified");
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password: " + e.getMessage());
        }
    }
}
