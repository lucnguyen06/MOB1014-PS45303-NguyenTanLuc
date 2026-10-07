package com.poly.lab3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhapSoHopLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so;
        int soLanNhap = 0;
        do {
            System.out.print("Nhap so: ");
            so = scanner.nextInt();
            soLanNhap++;
            if (!(so > 0 && so % 3 == 0 && so % 5 == 0)) {
                System.out.println("So khong hop le, moi nhap lai!");
            }
        } while (!(so > 0 && so % 3 == 0 && so % 5 == 0)); // Điều kiện lặp là phủ định của điều kiện hợp lệ

        System.out.println("So hop le: " + so + " (sau " + soLanNhap + " lan nhap)");
        scanner.close();
    }
}
