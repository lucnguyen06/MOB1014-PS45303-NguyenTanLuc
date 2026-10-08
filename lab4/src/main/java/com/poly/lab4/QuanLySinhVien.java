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
public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
            sc.nextLine(); 
            if (n <= 0) {
                System.out.println("So luong sinh vien phai lon hon 0. Vui long nhap lai!");
            }
        } while (n <= 0);
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Nhap thong tin sinh vien thu " + (i + 1) + " ===");
            ds[i] = new Student(); 
            ds[i].input(sc);
        }
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }
        Student svGpaMax = ds[0]; 
        for (int i = 1; i < n; i++) {
            if (ds[i].getGpa() > svGpaMax.getGpa()) { 
                svGpaMax = ds[i];
            }
        }
        System.out.println("\n=== SINH VIEN CO GPA CAO NHAT ===");
        svGpaMax.output();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ds[j].getGpa() < ds[j + 1].getGpa()) { 
                    Student tmp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = tmp;
                }
            }
        }
        System.out.println("\n=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }
        sc.close();
    }
}
