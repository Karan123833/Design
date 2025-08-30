package org.example.SOLID.OCP;

public class PaymentService {
    private final Payment payment;


    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void paymentprocesing(int amount) {
        payment.pay(amount);
        System.out.println("Payment done");
        // busimess logic
        // save to db anything like that
    }
}
