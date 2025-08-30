package org.example.DESIGN.SOLID.SRP;

public class UserRepository {
    public void save(User user) {
        System.out.println("Sving to DB..." + user.toString());
    }
}
