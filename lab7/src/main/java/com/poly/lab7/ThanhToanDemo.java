package com.poly.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moderator
 */
public class ThanhToanDemo {
    public static void main(String[] args) {
        double[] donHang = {100000, 250000, 1000000};

        List<Payment> methods = new ArrayList<>();
        methods.add(new CashPayment());
        methods.add(new CardPayment());

        for (double dh : donHang) {
            double tienMat = methods.get(0).pay(dh);
            double the = methods.get(1).pay(dh);
            System.out.printf("Don hang %.0f: Tien mat = %.0f | The = %.0f%n", dh, tienMat, the);
        }
    }
}
