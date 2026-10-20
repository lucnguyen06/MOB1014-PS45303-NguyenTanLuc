/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Moderator
 */
public class CapNhatLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        Scanner sc = new Scanner(System.in);

        // 1. Nhap ID can sua va ten moi
        System.out.print("Nhap ID laptop can sua: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten moi: ");
        String newName = sc.nextLine();

        boolean timThay = false;
        for (Laptop laptop : list) {
            if (laptop.getId().equalsIgnoreCase(id)) {
                laptop.setName(newName);
                timThay = true;
                break;
            }
        }

        if (timThay) {
            System.out.println("Da cap nhat laptop " + id);
        } else {
            System.out.println("Khong tim thay laptop co ID " + id);
        }

        // 2. Xoa cac laptop het hang (quantity == 0) bang cach duyet nguoc
        int countXoa = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getQuantity() == 0) {
                list.remove(i);
                countXoa++;
            }
        }
        System.out.println("Da xoa " + countXoa + " laptop het hang");

        // 3. Xuat danh sach sau khi cap nhat va xoa
        System.out.println("=== DANH SACH SAU CAP NHAT (" + list.size() + " may) ===");
        for (Laptop laptop : list) {
            laptop.output();
        }

        sc.close();
    }
}
