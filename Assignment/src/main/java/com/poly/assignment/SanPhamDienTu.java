package com.poly.assignment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPhamDienTu extends SanPham {
    private String ngayBaoHanh;

    public SanPhamDienTu() {
        super();
    }

    public SanPhamDienTu(String maSP, String tenSP, double donGia, int soLuong, String ngayBaoHanh) {
        super(maSP, tenSP, donGia, soLuong);
        this.ngayBaoHanh = ngayBaoHanh;
    }

    public String getBaoHanh() {
        return ngayBaoHanh;
    }

    public String getNgayBaoHanh() {
        return ngayBaoHanh;
    }

    public void setNgayBaoHanh(String ngayBaoHanh) {
        this.ngayBaoHanh = ngayBaoHanh;
    }

    @Override
    public void Nhap() {
        Nhap(new Scanner(System.in));
    }

    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhap thoi gian/ngay bao hanh (vi du: 12 thang): ");
        this.ngayBaoHanh = sc.nextLine().trim();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Bao hanh    : " + ngayBaoHanh);
        System.out.println("=========================================");
    }

    @Override
    public void capNhat() {
        capNhat(new Scanner(System.in));
    }

    public void capNhat(Scanner sc) {
        super.capNhat(sc);
        System.out.print("Nhap thoi gian bao hanh moi (Enter de giu nguyen): ");
        String bhMoi = sc.nextLine().trim();
        if (!bhMoi.isEmpty()) {
            this.ngayBaoHanh = bhMoi;
        }
        System.out.println("Cap nhat thoi gian bao hanh thanh cong!");
    }
}
