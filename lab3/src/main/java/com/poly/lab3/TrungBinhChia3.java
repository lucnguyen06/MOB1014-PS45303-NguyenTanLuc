/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TrungBinhChia3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n phai la so nguyen duong");
            return;
        }
        
        int tong = 0;
        int dem = 0;
        StringBuilder cacSo = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                tong += i;
                dem++;
                if (cacSo.length() > 0) {
                    cacSo.append(" ");
                }
                cacSo.append(i);
            }
        }

        if (dem == 0) {
            System.out.println("Khong co so nao chia het cho 3");
        } else {
            double trungBinh = (double) tong / dem;
            
            System.out.println("Cac so chia het cho 3: " + cacSo.toString());
            System.out.println("Tong: " + tong);
            System.out.printf("Trung binh cong: %.2f\n", trungBinh);
        }
        
        sc.close();
    }
}
