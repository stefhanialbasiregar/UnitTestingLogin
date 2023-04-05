package com.example.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginUtilTest {

    /**
     * TDD -> Test Development Driven
     * the input is not valid if....
     * the username/password is empty
     * the password contains than < 5 character
     */

    @Test
    public void emptyUsername() {
        assertFalse(LoginUtil.loginValidate(
                "",
                "12345"));
    }

    @Test
    public void passwordLessThanFive() {
        assertFalse(LoginUtil.loginValidate(
                "john",
                "1234"));
    }
}