/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;

/**
 *
 * @author Administrator
 */
public class Student {
    public String id;
    public String name;
    public int age;
    public double gpa;
    
    // Ham tao khong tham so
    public Student() {
    }
    
    // Ham tao co tham so
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public void input(java.util.Scanner sc) {
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        
        System.out.print("Nhap GPA: ");
        gpa = sc.nextDouble();
        sc.nextLine();
    }
    
    public String rank() {
        if (gpa >= 9.0) {
            return "Excellent";
        } else if (gpa >= 8.0) {
            return "Very Good";
        } else if (gpa >= 6.5) {
            return "Good";
        } else if (gpa >= 5.0) {
            return "Average";
        } else {
            return "Fail";
        }
    }
    
    public void output() {
        System.out.printf("ID: %s | Ho ten: %s | Tuoi: %d | GPA: %.2f | Xep loai: %s%n",
                id, name, age, gpa, rank());
    }
}
