package com.poly.lab3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class XuLyMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Nhap so phan tu n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So phan tu phai lon hon 0, moi nhap lai!");
            }
        } while (n <= 0);
        
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        
        System.out.print("Mang vua nhap: ");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        System.out.print("Cac phan tu chan: ");
        boolean coChanKhong = false;
        for (int value : a) {
            if (value % 2 != 0) {
                continue; 
                }
            System.out.print(value + " ");
            coChanKhong = true;
        }
        if (!coChanKhong) {
            System.out.print("Khong co phan tu chan");
        }
        System.out.println();
        
        int tong = 0;
        for (int value : a) {
            if (value % 4 == 0) {
                tong += value;
            }
        }
        System.out.println("Tong cac so chia het cho 4: " + tong);
        
        int max = a[0];
        for (int value : a) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Gia tri lon nhat: " + max);
        
        scanner.close();
    }
}
