package org.example.DESIGN.SOLID.SRP;

public class UserService {
    private final UserValidator userValidator;
    private final UserEmail userEmail;
    private final UserRepository userRepository;

    public UserService(UserValidator userValidator, UserEmail userEmail, UserRepository userRepository) {
        this.userValidator = userValidator;
        this.userEmail = userEmail;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        userValidator.validate(user);
        userRepository.save(user);
        userEmail.sendEmail(user);
        System.out.println("I have done my task in this we can business ligic as well");
    }
}
