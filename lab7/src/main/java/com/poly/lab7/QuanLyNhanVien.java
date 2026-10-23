package com.poly.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Moderator
 */
public class QuanLyNhanVien {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        list.add(new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000));
        list.add(new FullTimeEmployee("FT02", "Le Van Cuong", 15500000));
        list.add(new PartTimeEmployee("PT02", "Pham Thi Dung", 120, 60000));
        list.add(new PartTimeEmployee("PT03", "Hoang Van Em", 200, 90000));

        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee e : list) {
            System.out.printf("%s -> Luong: %.0f%n", e, e.getSalary());
        }

        double tongLuong = 0;
        for (Employee e : list) {
            tongLuong += e.getSalary();
        }
        System.out.printf("Tong quy luong: %.0f%n", tongLuong);

        Employee maxEmp = list.get(0);
        for (Employee e : list) {
            if (e.getSalary() > maxEmp.getSalary()) {
                maxEmp = e;
            }
        }
        System.out.printf("Nhan vien luong cao nhat: %s -> Luong: %.0f%n", maxEmp, maxEmp.getSalary());

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return Double.compare(b.getSalary(), a.getSalary());
            }
        });

        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");
        for (Employee e : list) {
            System.out.printf("%s -> Luong: %.0f%n", e, e.getSalary());
        }
    }
}
