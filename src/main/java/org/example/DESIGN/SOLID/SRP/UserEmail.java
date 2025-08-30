package org.example.DESIGN.SOLID.SRP;

public class UserEmail {
    public void sendEmail(User user) {
        System.out.println("Sending Email" + user.getEmail());
    }
}
