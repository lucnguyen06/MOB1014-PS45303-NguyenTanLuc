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
    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student() {
    }
        
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        setAge(age);    
        setGpa(gpa);    
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuoi khong hop le");
        }
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA khong hop le");
        }
    }
    
    public void input(java.util.Scanner sc) {
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        
        // Input validation cho tuoi (phai > 0) su dung do...while
        do {
            System.out.print("Nhap tuoi: ");
            while (!sc.hasNextInt()) {
                System.out.println("Vui long nhap so nguyen!");
                sc.next(); // Clear invalid input
                System.out.print("Nhap tuoi: ");
            }
            age = sc.nextInt();
            if (age <= 0) {
                System.out.println("Tuoi phai lon hon 0, moi nhap lai!");
            }
        } while (age <= 0);
        
        // Input validation cho GPA (phai >= 0 va <= 10) su dung do...while
        do {
            System.out.print("Nhap GPA: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Vui long nhap so thuc!");
                sc.next(); // Clear invalid input
                System.out.print("Nhap GPA: ");
            }
            gpa = sc.nextDouble();
            if (gpa < 0 || gpa > 10) {
                System.out.println("GPA phai tu 0 den 10, moi nhap lai!");
            }
        } while (gpa < 0 || gpa > 10);
        
        sc.nextLine(); // Clear buffer
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
