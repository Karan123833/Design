package org.example.SOLID.LSP;

public class main {
    public static void main(String[] args) {
        Email notificationSender = new Email();
        Notificationervice notificationervice = new Notificationervice(notificationSender);

        notificationervice.sendMessage();
    }
}
