package com.poly.assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuong;
    
    public SanPham() {
    }
    
    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public void Nhap() {
        Nhap(new Scanner(System.in));
    }

    public void Nhap(Scanner sc) {
        if (this.maSP == null || this.maSP.isEmpty()) {
            do {
                System.out.print("Nhap ma san pham (SPxxx, vi du: SP001): ");
                this.maSP = sc.nextLine().trim();
                if (!this.maSP.matches("^SP[0-9]{3}$")) {
                    System.out.println("Loi: Ma san pham phai co dang SPxxx voi xxx la 3 chu so (VD: SP001)!");
                }
            } while (!this.maSP.matches("^SP[0-9]{3}$"));
        }
        
        do {
            System.out.print("Nhap ten san pham: ");
            this.tenSP = sc.nextLine().trim();
            if (this.tenSP.isEmpty()) {
                System.out.println("Loi: Ten san pham khong duoc de trong!");
            }
        } while (this.tenSP.isEmpty());
        
        do {
            try {
                System.out.print("Nhap don gia: ");
                this.donGia = Double.parseDouble(sc.nextLine().trim());
                if (this.donGia < 0) {
                    System.out.println("Loi: Don gia phai lon hon hoac bang 0!");
                }
            } catch (Exception e) {
                System.out.println("Loi: Don gia phai la so hop le!");
                this.donGia = -1;
            }
        } while (this.donGia < 0);
        
        do {
            try {
                System.out.print("Nhap so luong: ");
                this.soLuong = Integer.parseInt(sc.nextLine().trim());
                if (this.soLuong < 0) {
                    System.out.println("Loi: So luong phai lon hon hoac bang 0!");
                }
            } catch (Exception e) {
                System.out.println("Loi: So luong phai la so nguyen!");
                this.soLuong = -1;
            }
        } while (this.soLuong < 0);
    }
    
    public void Xuat() {
        System.out.println("-----------------------------------------");
        System.out.println("Ma san pham : " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia     : " + String.format("%,.0f", donGia) + " VND");
        System.out.println("So luong    : " + soLuong);
        System.out.println("Thanh tien  : " + String.format("%,.0f", thanhTien()) + " VND");
    }
    
    public double thanhTien() {
        return donGia * soLuong;
    }
    
    public void capNhat() {
        capNhat(new Scanner(System.in));
    }

    public void capNhat(Scanner sc) {
        System.out.println("\n=== CAP NHAT SAN PHAM ===");
        System.out.println("Thong tin hien tai:");
        Xuat();
        
        System.out.print("Nhap ten san pham moi (Enter de giu nguyen): ");
        String tenMoi = sc.nextLine().trim();
        if (!tenMoi.isEmpty()) {
            this.tenSP = tenMoi;
        }
        
        System.out.print("Nhap don gia moi (Enter de giu nguyen): ");
        String giaStr = sc.nextLine().trim();
        if (!giaStr.isEmpty()) {
            try {
                double giaMoi = Double.parseDouble(giaStr);
                if (giaMoi >= 0) {
                    this.donGia = giaMoi;
                }
            } catch (Exception e) {
                System.out.println("Gia khong hop le, giu nguyen gia cu.");
            }
        }
        
        System.out.print("Nhap so luong moi (Enter de giu nguyen): ");
        String slStr = sc.nextLine().trim();
        if (!slStr.isEmpty()) {
            try {
                int slMoi = Integer.parseInt(slStr);
                if (slMoi >= 0) {
                    this.soLuong = slMoi;
                }
            } catch (Exception e) {
                System.out.println("So luong khong hop le, giu nguyen so luong cu.");
            }
        }
        
        System.out.println("Cap nhat thong tin co ban thanh cong!");
    }
    
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

