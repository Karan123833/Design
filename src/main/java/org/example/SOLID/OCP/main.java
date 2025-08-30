package org.example.SOLID.OCP;

public class main {
    public static void main(String[] args) {

        Payment creditCardPayment = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(creditCardPayment);

        System.out.println("Proceed to pay");
        paymentService.paymentprocesing(101);
        System.out.println("pAYMENT is over Thanks !!!!!");

    }
}
