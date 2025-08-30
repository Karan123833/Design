package org.example.SOLID.LSP;

public class SMS implements NotificationSender{
    @Override
    public void sendMessage() {
        System.out.println("Sending email throught notidicatiinsender");
    }
}
