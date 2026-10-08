/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class KhoiTaoSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tao sv1 bang ham tao co tham so ===");
        Student sv1 = new Student("PS001", "Nguyen Van An", 19, 8.25);
        sv1.output();
        System.out.println("\n=== Tao sv2 bang ham tao khong tham so ===");
        Student sv2 = new Student();
        System.out.println("Truoc khi nhap (gia tri mac dinh):");
        sv2.output();
        System.out.println("\nNhap thong tin cho sv2:");
        sv2.input(sc);
        System.out.println("Sau khi nhap:");
        sv2.output();
        sc.close();
    }
}
