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
public class PhieuDatPhong {
    private KhachHang khachHang;
    private NhanVien nhanVienLap;
    private Phong phong;
    private LocalDate ngayNhanPhong;
    private LocalDate ngayTraPhong;
    
    public PhieuDatPhong(){
        
    }

    public PhieuDatPhong(KhachHang khachHang, NhanVien nhanVienLap, Phong phong, LocalDate ngayNhanPhong, LocalDate ngayTraPhong) {
        this.khachHang = khachHang;
        this.nhanVienLap = nhanVienLap;
        this.phong = phong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
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
    
    
}
