package org.example.DESIGN.SOLID.SRP;

public class UserValidator {
    public void validate(User user) {
        if(user.getEmail().isEmpty()||user.getEmail()==null) {
            throw new RuntimeException("Email is requiored to be there");
        }
        System.out.println("validtion done " + user.getEmail());
    }
}
