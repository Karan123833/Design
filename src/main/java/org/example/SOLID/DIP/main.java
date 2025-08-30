package org.example.SOLID.DIP;

public class main {
    public static void main(String[] args) {
        NotificationMessage notificationMessage = new EmailNotificationMessage();
        NotificationService notificationService = new NotificationService(notificationMessage);
        User user = new User("testing_happening@gmail.com");
        notificationService.sendNotification(user);
    }
}
