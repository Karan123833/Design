package org.example.SOLID.DIP;

public class NotificationService {
    private final NotificationMessage notificationMessage;

    public NotificationService(NotificationMessage notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public void sendNotification(User user) {
        this.notificationMessage.sendMessage(user);
    }
}
