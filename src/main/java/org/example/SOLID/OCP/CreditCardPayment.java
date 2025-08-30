package org.example.SOLID.OCP;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying through the CrediteCard");
    }
}
