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
public class Bai4_hinhchunhat {
    public static void main(String[] args) {
        //final double PI = 3,14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chu dai ");
        double chieudai = sc.nextDouble();
        System.out.println("Nhap chieu rong");
        double chieurong = sc.nextDouble();
        double chuvi = 2*chieudai+chieurong;
        double dientich = chieudai*chieurong;
        System.out.println("Chu vi chu nhat: " + chuvi);
        System.out.println("Dien tich chu nhat: " +dientich);
    }
}
