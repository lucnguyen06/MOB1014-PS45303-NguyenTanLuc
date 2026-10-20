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
public class TimKiemLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        Scanner sc = new Scanner(System.in);

        // 1. Loc theo khoang gia
        System.out.print("Nhap gia min: ");
        double min = sc.nextDouble();
        System.out.print("Nhap gia max: ");
        double max = sc.nextDouble();
        sc.nextLine(); // Xu ly troi lenh

        if (min > max) {
            System.out.println("Khoang gia khong hop le");
        } else {
            System.out.printf("=== LAPTOP GIA TU %.0f DEN %.0f ===%n", min, max);
            boolean timThayGia = false;
            for (Laptop laptop : list) {
                if (laptop.getPrice() >= min && laptop.getPrice() <= max) {
                    laptop.output();
                    timThayGia = true;
                }
            }
            if (!timThayGia) {
                System.out.println("Khong tim thay laptop nao");
            }
        }

        // 2. Tim kiem theo tu khoa (id hoac ten)
        System.out.print("Nhap tu khoa tim kiem: ");
        String keyword = sc.nextLine();

        System.out.println("=== KET QUA TIM KIEM \"" + keyword + "\" ===");
        boolean timThayKeyword = false;
        for (Laptop laptop : list) {
            if (laptop.getId().equalsIgnoreCase(keyword)
                    || laptop.getName().toLowerCase().contains(keyword.toLowerCase())) {
                laptop.output();
                timThayKeyword = true;
            }
        }
        if (!timThayKeyword) {
            System.out.println("Khong tim thay laptop nao");
        }

        sc.close();
    }
}
