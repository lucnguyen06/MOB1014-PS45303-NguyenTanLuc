/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Assignment {
    
    private static ArrayList<SanPham> danhSachSP = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon = -1;
        
        do {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            try {
                luaChon = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                luaChon = -1;
            }
            
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
                case 5:
                    xoaSanPham();
                    break;
                case 6:
                    sapXepSanPhamTheoTen();
                    break;
                case 7:
                    khoiTaoDuLieuMau();
                    break;
                case 0:
                    System.out.println("\nCam on ban da su dung chuong trinh! Tam biet.");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le! Vui long chon lai tu 0 den 7.");
            }
            
            if (luaChon != 0) {
                System.out.println("\nNhan Enter de tiep tuc...");
                sc.nextLine();
            }
            
        } while (luaChon != 0);
    }
    
    private static void hienThiMenu() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║          CHUONG TRINH QUAN LY SAN PHAM                 ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║  1. Nhap thong tin san pham                            ║");
        System.out.println("║  2. Hien thi danh sach san pham                        ║");
        System.out.println("║  3. Cap nhat thong tin san pham theo ma                ║");
        System.out.println("║  4. Tim kiem san pham theo ma hoac ten                 ║");
        System.out.println("║  5. Xoa san pham trong danh sach theo ma               ║");
        System.out.println("║  6. Sap xep danh sach san pham theo ten                ║");
        System.out.println("║  7. Khoi tao du lieu mau (Demo nhanh)                  ║");
        System.out.println("║  0. Thoat chuong trinh                                 ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }
    
    private static void themSanPham() {
        String tiepTuc = "Y";
        
        do {
            System.out.println("\n=== NHAP THONG TIN SAN PHAM ===");
            System.out.println("Chon loai san pham can nhap:");
            System.out.println("1. San pham thong thuong");
            System.out.println("2. San pham dien tu (co them bao hanh)");
            System.out.println("3. San pham tieu dung (co them han su dung, giam gia)");
            System.out.print("Lua chon cua ban (1-3): ");
            
            int loai = 1;
            try {
                loai = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                loai = 1;
            }
            
            String maSP = "";
            while (true) {
                System.out.print("Nhap ma san pham (SPxxx, vi du: SP001): ");
                maSP = sc.nextLine().trim();
                
                if (!maSP.matches("^SP[0-9]{3}$")) {
                    System.out.println("Loi: Ma san pham phai co dang SPxxx voi xxx la 3 chu so (VD: SP001)!");
                    continue;
                }
                
                boolean trungMa = false;
                for (SanPham sp : danhSachSP) {
                    if (sp.getMaSP().equalsIgnoreCase(maSP)) {
                        trungMa = true;
                        break;
                    }
                }
                
                if (trungMa) {
                    System.out.println("Loi: Ma san pham " + maSP + " da ton tai trong he thong! Vui long nhap ma khac.");
                } else {
                    break;
                }
            }
            
            SanPham spMoi;
            if (loai == 2) {
                spMoi = new SanPhamDienTu();
            } else if (loai == 3) {
                spMoi = new SanPhamTieuDung();
            } else {
                spMoi = new SanPham();
            }
            
            spMoi.setMaSP(maSP);
            spMoi.Nhap(sc);
            
            danhSachSP.add(spMoi);
            System.out.println("\nThem san pham [" + maSP + "] thanh cong!");
            
            System.out.print("\nBan co muon nhap tiep khong? (Y/N): ");
            tiepTuc = sc.nextLine().trim();
            
        } while (tiepTuc.equalsIgnoreCase("Y"));
    }
    
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
    
    private static void capNhatSanPham() {
        System.out.println("\n=== CAP NHAT SAN PHAM ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        System.out.print("Nhap ma san pham can cap nhat: ");
        String maSP = sc.nextLine().trim();
        
        SanPham spCanSua = null;
        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().equalsIgnoreCase(maSP)) {
                spCanSua = sp;
                break;
            }
        }
        
        if (spCanSua != null) {
            spCanSua.capNhat(sc);
            System.out.println("\nCap nhat thong tin san pham [" + maSP + "] thanh cong!");
        } else {
            System.out.println("\nKhong tim thay san pham voi ma: " + maSP);
        }
    }
    
    private static void timKiemSanPham() {
        System.out.println("\n=== TIM KIEM SAN PHAM ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        System.out.print("Nhap ma hoac ten san pham can tim: ");
        String tuKhoa = sc.nextLine().trim().toLowerCase();
        
        int dem = 0;
        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().toLowerCase().contains(tuKhoa) || 
                sp.getTenSP().toLowerCase().contains(tuKhoa)) {
                sp.Xuat();
                dem++;
            }
        }
        
        if (dem == 0) {
            System.out.println("\nKhong tim thay san pham nao phu hop voi tu khoa: " + tuKhoa);
        } else {
            System.out.println("\nTim thay tong cong " + dem + " san pham phu hop.");
        }
    }
    
    private static void xoaSanPham() {
        System.out.println("\n=== XOA SAN PHAM ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        System.out.print("Nhap ma san pham can xoa: ");
        String maSP = sc.nextLine().trim();
        
        boolean daXoa = false;
        for (int i = 0; i < danhSachSP.size(); i++) {
            if (danhSachSP.get(i).getMaSP().equalsIgnoreCase(maSP)) {
                danhSachSP.remove(i);
                daXoa = true;
                System.out.println("\nDa xoa thanh cong san pham co ma: " + maSP);
                break;
            }
        }
        
        if (!daXoa) {
            System.out.println("\nKhong tim thay san pham co ma: " + maSP + " de xoa!");
        }
    }
    
    private static void sapXepSanPhamTheoTen() {
        System.out.println("\n=== SAP XEP SAN PHAM THEO TEN (A-Z) ===");
        
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach san pham rong!");
            return;
        }
        
        int n = danhSachSP.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (danhSachSP.get(i).getTenSP().compareToIgnoreCase(danhSachSP.get(j).getTenSP()) > 0) {
                    SanPham temp = danhSachSP.get(i);
                    danhSachSP.set(i, danhSachSP.get(j));
                    danhSachSP.set(j, temp);
                }
            }
        }
        
        System.out.println("Da sap xep danh sach theo ten thanh cong!");
        xemDanhSachSanPham();
    }
    
    private static void khoiTaoDuLieuMau() {
        danhSachSP.clear();
        danhSachSP.add(new SanPham("SP001", "Ban phim co RGB", 750000, 10));
        danhSachSP.add(new SanPhamDienTu("SP002", "Dien thoai iPhone 15", 22000000, 5, "12 thang"));
        danhSachSP.add(new SanPhamTieuDung("SP003", "Sua tuoi tiet trung", 38000, 40, "12/2026", 5000));
        danhSachSP.add(new SanPhamDienTu("SP004", "Laptop Asus TUF Gaming", 25000000, 3, "24 thang"));
        danhSachSP.add(new SanPhamTieuDung("SP005", "Banh quy bo Phap", 85000, 20, "06/2026", 10000));
        
        System.out.println("\nDa khoi tao san 5 san pham mau (gom ca 3 loai san pham) thanh cong!");
        xemDanhSachSanPham();
    }
}

