package com.fpoly.lab8;

import java.util.Scanner;

/**
 *
 * @author Moderator
 */
public class XuLyHoTen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        String trimmed = hoTen.trim();
        if (trimmed.isEmpty()) {
            System.out.println("Ho ten khong duoc de trong");
            sc.close();
            return;
        }

        System.out.println("Sau trim: " + trimmed + " (" + trimmed.length() + " ky tu)");

        String chuanHoa = trimmed.replaceAll("\\s+", " ");
        System.out.println("Chuan hoa khoang trang: " + chuanHoa);

        System.out.println("In hoa: " + chuanHoa.toUpperCase());

        String[] words = chuanHoa.split(" ");
        System.out.println("So tu: " + words.length);

        StringBuilder hoTenChuan = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                String wordFormatted = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
                if (hoTenChuan.length() > 0) {
                    hoTenChuan.append(" ");
                }
                hoTenChuan.append(wordFormatted);
            }
        }
        System.out.println("Ho ten chuan: " + hoTenChuan);

        sc.close();
    }
}
