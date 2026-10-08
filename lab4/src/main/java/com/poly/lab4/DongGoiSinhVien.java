/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;

/**
 *
 * @author Administrator
 */
public class DongGoiSinhVien {
    public static void main(String[] args) {
        Student sv = new Student("PS002", "Tran Thi Binh", 20, 7.0);
        sv.setGpa(12);
        System.out.printf("GPA hien tai: %.2f%n", sv.getGpa());
        sv.setGpa(9.2);
        sv.output();
    }
}
