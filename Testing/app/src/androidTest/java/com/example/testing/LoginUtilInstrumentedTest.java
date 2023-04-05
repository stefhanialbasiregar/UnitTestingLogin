package com.example.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class LoginUtilInstrumentedTest {

    @Test
    public void testLoginUser() {
        Login login = new Login("username", "password");
        assertTrue(LoginUtil.loginUser(login));
    }

    @Test
    public void testChangePassword() {
        Login login = new Login("username", "password");
        LoginUtil.changePassword(login, "newPassword");
        assertTrue(login.validateCredentials());
    }

    @Test
    public void testLoginValidate() {
        assertTrue(LoginUtil.loginValidate("username", "password123"));
        assertFalse(LoginUtil.loginValidate("", "password"));
        assertFalse(LoginUtil.loginValidate("username", ""));
        assertFalse(LoginUtil.loginValidate("username", "123"));
    }
}
