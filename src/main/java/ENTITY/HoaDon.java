/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.time.LocalDate;

/**
 *
 * @author 84837
 */
public class HoaDon {
    private String maHoaDon;
    private KhuyenMai khuyenMai;
    private NhanVien nhanVienLap;
    private KhachHang khachHang;
    private LocalDate ngayLap;
    private LocalDate ngayNhanPhong;
    private LocalDate ngayTraPhong;
    private int thue;
    private Double tienTraKhach;
    private Double tongTien;

    public HoaDon(String maHoaDon, KhuyenMai khuyenMai, NhanVien nhanVienLap, KhachHang khachHang, LocalDate ngayLap, LocalDate ngayNhanPhong, LocalDate ngayTraPhong, int thue, Double tienTraKhach, Double tongTien) {
        this.maHoaDon = maHoaDon;
        this.khuyenMai = khuyenMai;
        this.nhanVienLap = nhanVienLap;
        this.khachHang = khachHang;
        this.ngayLap = ngayLap;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.thue = thue;
        this.tienTraKhach = tienTraKhach;
        this.tongTien = tongTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public LocalDate getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(LocalDate ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public LocalDate getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(LocalDate ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    public Double getTienTraKhach() {
        return tienTraKhach;
    }

    public void setTienTraKhach(Double tienTraKhach) {
        this.tienTraKhach = tienTraKhach;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
