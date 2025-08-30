package org.example.SOLID.DIP;

public class User {
    String email;
    User(String email) {
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
}
