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
public class NhapXuatLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        String tiepTuc;

        do {
            // Tao doi tuong moi cho moi laptop
            Laptop laptop = new Laptop();
            laptop.input(sc);
            list.add(laptop);

            System.out.print("Tiep tuc nhap? (y/n): ");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("y"));

        System.out.println(
            "=== DANH SACH LAPTOP (" + list.size() + " may) ==="
        );

        for (Laptop laptop : list) {
            laptop.output();
        }

        sc.close();
    }
}