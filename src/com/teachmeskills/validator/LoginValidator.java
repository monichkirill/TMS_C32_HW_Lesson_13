package com.teachmeskills.validator;

import com.teachmeskills.exceptions.WrongLoginException;

public class LoginValidator {
    public static void validateLogin(String login) throws WrongLoginException {
        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login");
        }
    }
}
