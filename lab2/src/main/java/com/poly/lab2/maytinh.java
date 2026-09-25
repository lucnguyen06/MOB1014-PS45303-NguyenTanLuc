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
public class maytinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap a: ");
        double a = sc.nextDouble();
        
        System.out.println("nhap b: ");
        double b = sc.nextDouble();
        System.out.println("nhap phep toan (+,-,*,/)");
        char op = sc.next().charAt(0);
        switch(op) {
            case'+' -> {
                
                System.out.printf("%.2f + %.2f = %.2f%n ", a, b, a + b);
            }
           
            case'-' -> {
                
                System.out.printf("%.2f - %.2f = %.2f%n ", a, b, a - b);
            }
           
            case'*' -> {
                
                System.out.printf("%.2f * %.2f = %.2f%n ", a, b, a * b);
            }
           
            case'/' -> {
                
                if (b == 0){
                    System.out.print("khong the chia 0");
                    break;
                } else {
                    System.out.println("%.2f / %.2f = %.2f%n , a, b, a / b");
                            }
            }
            default -> System.out.println("phep toan khong hop le");
    }
}
}