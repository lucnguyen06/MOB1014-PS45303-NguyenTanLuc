/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class xeploaihocluc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem toan");
        double toan = sc.nextDouble();
        System.out.println("nhap diem ly");
        double ly = sc.nextDouble();
        System.out.println("nhap diem hoa");
        double hoa = sc.nextDouble();
        if (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10) {
            System.out.println("diem khong hop le");
        }
        double dtb = (toan * 2 + ly * 2 + hoa *2);
        String xeploai;
        if (dtb >= 8) {
            xeploai = "gioi";
        }
         else if (dtb >= 6.5){
              xeploai = "kha";
        } else if (dtb >= 5.0) {
         xeploai = "trungbinh";
    } else {
             xeploai = "yeu";
        } 
        System.out.println("diem trung binh: %.2f%n" + dtb);
        System.out.println("Xep loai:" + xeploai);
        sc.close();
    }
    
}
