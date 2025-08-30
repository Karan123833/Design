package org.example.SOLID.DIP;

public class EmailNotificationMessage implements NotificationMessage{
    @Override
    public void sendMessage(User user) {
        System.out.println("Notification is sent through email" + user.getEmail());
    }
}
