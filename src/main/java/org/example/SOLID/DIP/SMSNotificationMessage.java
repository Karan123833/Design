package org.example.SOLID.DIP;

public class SMSNotificationMessage implements NotificationMessage{
    @Override
    public void sendMessage(User user) {
        System.out.println("SMS notification sent" + user.getEmail());
    }
}
