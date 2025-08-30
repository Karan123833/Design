package org.example.SOLID.LSP;

public class Email implements NotificationSender{
    @Override
    public void sendMessage() {
        System.out.println("Email notification sent!");
    }
}