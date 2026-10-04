package com.poly.assignment;

import java.util.Scanner;

/**
 * Lớp quản lý thông tin sản phẩm
 * @author Administrator
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuong;
    
    // Constructor mặc định
    public SanPham() {
    }
    
    // Constructor có tham số
    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    // Phương thức nhập thông tin sản phẩm
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma san pham: ");
        this.maSP = sc.nextLine();
        
        System.out.print("Nhap ten san pham: ");
        this.tenSP = sc.nextLine();
        
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        
        System.out.print("Nhap so luong: ");
        this.soLuong = sc.nextInt();
    }
    
    // Phương thức xuất thông tin sản phẩm
    public void Xuat() {
        System.out.println("=========================================");
        System.out.println("Ma san pham: " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia: " + String.format("%,.0f", donGia) + " VND");
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + String.format("%,.0f", thanhTien()) + " VND");
        System.out.println("=========================================");
    }
    
    // Phương thức tính thành tiền
    public double thanhTien() {
        return donGia * soLuong;
    }
    
    // Phương thức cập nhật thông tin sản phẩm
    public void capNhat() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== CAP NHAT SAN PHAM ===");
        System.out.println("Thong tin hien tai:");
        Xuat();
        
        System.out.print("\nNhap ten san pham moi (Enter de giu nguyen): ");
        String tenMoi = sc.nextLine();
        if (!tenMoi.trim().isEmpty()) {
            this.tenSP = tenMoi;
        }
        
        System.out.print("Nhap don gia moi (0 de giu nguyen): ");
        double giaMoi = sc.nextDouble();
        if (giaMoi > 0) {
            this.donGia = giaMoi;
        }
        
        System.out.print("Nhap so luong moi (-1 de giu nguyen): ");
        int slMoi = sc.nextInt();
        if (slMoi >= 0) {
            this.soLuong = slMoi;
        }
        
        System.out.println("\nCap nhat thanh cong!");
    }
    
    // Getters và Setters
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
