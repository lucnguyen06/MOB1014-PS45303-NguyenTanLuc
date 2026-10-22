package com.fpoly.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Moderator
 */

public class QuanLyHinhTru {
    public static void main(String[] args) {
        List<Cylinder> list = new ArrayList<>();
        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));

        System.out.println("=== DANH SACH HINH TRU ===");
        for (Cylinder cy : list) {
            System.out.println(cy);
        }

        double tongTheTich = 0;
        for (Cylinder cy : list) {
            tongTheTich += cy.getVolume();
        }
        System.out.printf(Locale.US, "Tong the tich: %.2f%n", tongTheTich);

        Cylinder maxCy = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getVolume() > maxCy.getVolume()) {
                maxCy = list.get(i);
            }
        }
        System.out.println("Hinh tru co the tich lon nhat:");
        System.out.println(maxCy);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        String mau = sc.nextLine();

        System.out.println("=== HINH TRU MAU " + mau + " ===");
        boolean found = false;
        for (Cylinder cy : list) {
            if (cy.getColor().equalsIgnoreCase(mau.trim())) {
                System.out.println(cy);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co hinh tru mau " + mau);
        }

        sc.close();
    }
}
