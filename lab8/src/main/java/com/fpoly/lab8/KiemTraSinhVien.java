package com.fpoly.lab8;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Moderator
 */
public class KiemTraSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;
        do {
            System.out.print("Nhap ma SV: ");
            id = sc.nextLine();
            if (!id.matches("^SV[0-9]{3}$")) {
                System.out.println("Ma SV phai co dang SVxxx (x la chu so)");
            }
        } while (!id.matches("^SV[0-9]{3}$"));

        String name;
        do {
            System.out.print("Nhap ho ten: ");
            name = sc.nextLine();
            if (!name.matches("^[a-zA-Z ]+$")) {
                System.out.println("Ho ten chi duoc chua chu cai va khoang trang");
            }
        } while (!name.matches("^[a-zA-Z ]+$"));

        Pattern phonePattern = Pattern.compile("^0[0-9]{9}$");
        String phone;
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = sc.nextLine();
            if (!phonePattern.matcher(phone).matches()) {
                System.out.println("So dien thoai phai bat dau bang 0 va co 10 chu so");
            }
        } while (!phonePattern.matcher(phone).matches());

        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        String email;
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (!email.matches(emailRegex)) {
                System.out.println("Email khong dung dinh dang");
            }
        } while (!email.matches(emailRegex));

        System.out.println("=== THONG TIN SINH VIEN HOP LE ===");
        System.out.println("Ma SV: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Email: " + email);

        sc.close();
    }
}
