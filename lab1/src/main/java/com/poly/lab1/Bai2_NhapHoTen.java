/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai2_NhapHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho Ten");
        String hoten = sc.nextLine();
        System.out.println(" Nhap nam sinh");
        int namsinh = sc.nextInt();
        int tuoi = 2026 - namsinh;
        System.out.println("Ho Va Ten " + hoten);
        System.out.println("Tuoi " + tuoi);
    }
    
}
