package com.example.testing;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validateCredentials() {
        // lakukan validasi username dan password pada database atau server
        // jika username dan password valid, kembalikan nilai true, jika tidak kembalikan nilai false
        return true; // contoh nilai yang selalu valid
    }

    // getter dan setter untuk variabel username dan password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

