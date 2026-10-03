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
public class NhapXuatSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student sv1 = new Student();
        System.out.println("=== Nhap thong tin sinh vien 1 ===");
        sv1.input(sc);
        
        Student sv2 = new Student();
        System.out.println("\n=== Nhap thong tin sinh vien 2 ===");
        sv2.input(sc);
        
        System.out.println("\n=== Thong tin sinh vien ===");
        sv1.output();
        sv2.output();
        
        sc.close();
    }
}
