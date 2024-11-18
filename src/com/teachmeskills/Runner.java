package com.teachmeskills;

import com.teachmeskills.service.LoginCheck;
import com.teachmeskills.service.PasswordCheck;

public class Runner {
    public static void main(String[] args) {
        LoginCheck.loginCheck();
        PasswordCheck.passwordCheck();
    }
}
