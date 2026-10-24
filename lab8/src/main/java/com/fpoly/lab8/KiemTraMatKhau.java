package com.fpoly.lab8;

import java.util.Scanner;

/**
 *
 * @author Moderator
 */
public class KiemTraMatKhau {

    public static void kiemTra(String pw) throws InvalidPasswordException {
        if (pw == null || pw.length() < 8) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 8 ky tu");
        }

        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;
        String specialChars = "!@#$%^&*";

        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpper++;
            } else if (Character.isLowerCase(c)) {
                countLower++;
            } else if (Character.isDigit(c)) {
                countDigit++;
            } else if (specialChars.indexOf(c) >= 0) {
                countSpecial++;
            }
        }

        if (countUpper < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu hoa");
        }
        if (countLower < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu thuong");
        }
        if (countDigit < 3) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 3 chu so");
        }
        if (countSpecial < 1) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 1 ky tu dac biet (!@#$%^&*)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap mat khau: ");
            String pw = sc.nextLine();
            try {
                kiemTra(pw);
                System.out.println("Mat khau hop le!");
                break;
            } catch (InvalidPasswordException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }
        sc.close();
    }
}
