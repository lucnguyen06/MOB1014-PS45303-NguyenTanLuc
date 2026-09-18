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
public class Bai3_Hinhtron {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        double banhkinh = sc.nextDouble();
        double chuvi = 2*PI*banhkinh;
        double dientich = PI*banhkinh*chuvi;
        System.out.printf("Chu vi hinh tron:%.2f%n", chuvi);
        System.out.printf("Dien tich hinh tron:%.2f%n", dientich);
    }
}
