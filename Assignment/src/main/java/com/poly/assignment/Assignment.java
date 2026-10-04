/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Chương trình quản lý sản phẩm
 * @author Administrator
 */
public class Assignment {
    
    private static ArrayList<SanPham> danhSachSP = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;
        
        do {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine(); // Đọc bỏ ký tự xuống dòng
            
            switch (luaChon) {
                case 1:
                    themSanPham();
                    break;
                case 2:
                    xemDanhSachSanPham();
                    break;
                case 3:
                    capNhatSanPham();
                    break;
                case 4:
                    timKiemSanPham();
                    break;
                case 0:
                    System.out.println("\nCam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le! Vui long chon lai.");
            }
            
            if (luaChon != 0) {
                System.out.println("\nNhan Enter de tiep tuc...");
                sc.nextLine();
            }
            
        } while (luaChon != 0);
    }
    
    // Hiển thị menu chương trình
    private static void hienThiMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   CHUONG TRINH QUAN LY SAN PHAM       ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║  1. Them san pham                      ║");
        System.out.println("║  2. Xem danh sach san pham             ║");
        System.out.println("║  3. Cap nhat san pham                  ║");
        System.out.println("║  4. Tim kiem san pham                  ║");
        System.out.println("║  0. Thoat                              ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
    
    // Thêm sản phẩm mới
    private static void themSanPham() {
        System.out.println("\n=== THEM SAN PHAM MOI ===");
        
        SanPham sp = new SanPham();
        sp.Nhap();
        
        // Kiểm tra trùng mã sản phẩm
        for (SanPham sanPham : danhSachSP) {
            if (sanPham.getMaSP().equalsIgnoreCase(sp.getMaSP())) {
                System.out.println("\nLoi: Ma san pham da ton tai!");
                return;
            }
        }
        
        danhSachSP.add(sp);
        System.out.println("\nThem san pham thanh cong!");
    }
    
    // Xem danh sách sản phẩm
    private static void xemDanhSachSanPham() {
        System.out.println("\n=== DANH SACH SAN PHAM ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        System.out.println("Tong so san pham: " + danhSachSP.size());
        double tongGiaTri = 0;
        
        for (int i = 0; i < danhSachSP.size(); i++) {
            System.out.println("\nSan pham thu " + (i + 1) + ":");
            danhSachSP.get(i).Xuat();
            tongGiaTri += danhSachSP.get(i).thanhTien();
        }
        
        System.out.println("\n>>> TONG GIA TRI KHO: " + String.format("%,.0f", tongGiaTri) + " VND <<<");
    }
    
    // Cập nhật thông tin sản phẩm
    private static void capNhatSanPham() {
        System.out.println("\n=== CAP NHAT SAN PHAM ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        System.out.print("Nhap ma san pham can cap nhat: ");
        String maSP = sc.nextLine();
        
        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().equalsIgnoreCase(maSP)) {
                sp.capNhat();
                return;
            }
        }
        
        System.out.println("\nKhong tim thay san pham voi ma: " + maSP);
    }
    
    // Tìm kiếm sản phẩm
    private static void timKiemSanPham() {
        System.out.println("\n=== TIM KIEM SAN PHAM ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        System.out.print("Nhap ma hoac ten san pham can tim: ");
        String tuKhoa = sc.nextLine().toLowerCase();
        
        boolean timThay = false;
        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().toLowerCase().contains(tuKhoa) || 
                sp.getTenSP().toLowerCase().contains(tuKhoa)) {
                sp.Xuat();
                timThay = true;
            }
        }
        
        if (!timThay) {
            System.out.println("\nKhong tim thay san pham nao phu hop!");
        }
    }
}
