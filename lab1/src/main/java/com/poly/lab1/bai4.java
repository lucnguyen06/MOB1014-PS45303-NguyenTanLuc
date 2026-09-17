/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(System.in);

        // Khai báo hằng số PI theo yêu cầu
        final double PI = 3.14;

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhap chieu dai: ");
        double chieuDai = Scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double chieuRong = Scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        // Xuất kết quả
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);

        Scanner.close();
    }
         
     }
