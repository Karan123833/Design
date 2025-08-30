package org.example.SOLID.OCP;

public class DebitCardPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Payinmg through the DebitCard");
    }
}
