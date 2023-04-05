package com.example.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    private Login login;

    @Before
    public void setUp() {
        login = new Login("john", "password");
    }

    @Test
    public void testValidateCredentialsWithValidCredentials() {
        assertTrue(login.validateCredentials());
    }

    @Test
    public void testValidateCredentialsWithInvalidCredentials() {
        login.setUsername("invalid");
        login.setPassword("invalid");
        assertFalse(login.validateCredentials());
    }
}
