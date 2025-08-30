package org.example.DESIGN.SOLID.SRP;

public class User {
    private String email;
    User(String mail) {
        email=mail;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }
}
