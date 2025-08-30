package org.example.DESIGN.SOLID.SRP;

public class main {
    public static void main(String[] args) {
        UserValidator userValidator=new UserValidator();
        UserRepository userRepository = new UserRepository();
        UserEmail userEmail=new UserEmail();

        UserService userService = new UserService(userValidator,userEmail,userRepository);
        System.out.println("uSER IS CALLING");
        User user = new User("TEST@xyz.com");
        userService.registerUser(user);
        System.out.println("User registered");
    }
}
