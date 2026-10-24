package com.poly.assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPhamTieuDung extends SanPham {
    private String hanSuDung;
    private double giamGia;

    public SanPhamTieuDung() {
        super();
    }

    public SanPhamTieuDung(String maSP, String tenSP, double donGia, int soLuong, String hanSuDung, double giamGia) {
        super(maSP, tenSP, donGia, soLuong);
        this.hanSuDung = hanSuDung;
        this.giamGia = giamGia;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getThanhTien() {
        return thanhTien();
    }

    @Override
    public double thanhTien() {
        double tong = (getDonGia() * getSoLuong()) - giamGia;
        return tong > 0 ? tong : 0;
    }

    @Override
    public void Nhap() {
        Nhap(new Scanner(System.in));
    }

    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhap han su dung (vi du: 12/2026): ");
        this.hanSuDung = sc.nextLine().trim();

        do {
            try {
                System.out.print("Nhap so tien giam gia (VND): ");
                this.giamGia = Double.parseDouble(sc.nextLine().trim());
                if (this.giamGia < 0) {
                    System.out.println("Giam gia phai >= 0!");
                }
            } catch (Exception e) {
                System.out.println("Giam gia phai la so!");
                this.giamGia = -1;
            }
        } while (this.giamGia < 0);
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Han su dung : " + hanSuDung);
        System.out.println("Giam gia    : " + String.format("%,.0f", giamGia) + " VND");
        System.out.println("=========================================");
    }

    @Override
    public void capNhat() {
        capNhat(new Scanner(System.in));
    }

    public void capNhat(Scanner sc) {
        super.capNhat(sc);
        System.out.print("Nhap han su dung moi (Enter de giu nguyen): ");
        String hsdMoi = sc.nextLine().trim();
        if (!hsdMoi.isEmpty()) {
            this.hanSuDung = hsdMoi;
        }

        System.out.print("Nhap giam gia moi (-1 hoac Enter de giu nguyen): ");
        String ggStr = sc.nextLine().trim();
        if (!ggStr.isEmpty()) {
            try {
                double ggMoi = Double.parseDouble(ggStr);
                if (ggMoi >= 0) {
                    this.giamGia = ggMoi;
                }
            } catch (Exception e) {
            }
        }
        System.out.println("Cap nhat thong tin tieu dung thanh cong!");
    }
}
