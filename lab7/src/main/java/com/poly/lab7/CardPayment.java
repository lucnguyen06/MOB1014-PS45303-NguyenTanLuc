package com.poly.lab7;

/**
 *
 * @author Moderator
 */
public class CardPayment implements Payment {
    @Override
    public double pay(double amount) {
        double discounted = amount * 0.95;
        return discounted + discounted * TAX;
    }
}
