package com.example.testing;

public class LoginUtil {

    public static boolean loginUser(Login login) {
        return login.validateCredentials();
    }

    public static void changePassword(Login login, String newPassword) {
        login.setPassword(newPassword);
    }

    public static boolean loginValidate(String username, String password) {

        if(username.isEmpty()||password.isEmpty()){
            return false;
        }
        if (password.length()>5){
            return true;
        }
        return false;
    }
}
