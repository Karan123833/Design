package org.example.SOLID.LSP;

public class Notificationervice {
    private final NotificationSender notificationSender;

    public Notificationervice(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendMessage() {
        this.notificationSender.sendMessage();
    }
}
