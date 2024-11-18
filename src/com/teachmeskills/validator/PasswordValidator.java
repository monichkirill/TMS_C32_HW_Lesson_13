package com.teachmeskills.validator;

import com.teachmeskills.exceptions.WrongPasswordException;

public class PasswordValidator {
    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null
                || !password.equals(confirmPassword)
                || password.contains(" ")
                || password.length() >= 20
                || password.chars().noneMatch(Character::isDigit)) {
            throw new WrongPasswordException("Wrong password");
        }
    }
}
