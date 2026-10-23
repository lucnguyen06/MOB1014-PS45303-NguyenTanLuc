package com.poly.lab7;

/**
 *
 * @author Moderator
 */
public class CashPayment implements Payment {
    @Override
    public double pay(double amount) {
        return amount + amount * TAX;
    }
}
