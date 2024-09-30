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
public class NhanVien {
    
    private String maNhanVien;
    private String tenNhanVien;
    private String loaiNhanVien;
    private String phai;
    private LocalDate ngaySinh;
    private String password;
    private String CCCD;
    private String soDienThoai;
    private Boolean trangThai;
    
    public NhanVien(){
        this("", "", "", "", LocalDate.now(), "", "", "", true);
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String loaiNhanVien, String phai, LocalDate ngaySinh, String password, String CCCD, String soDienThoai, Boolean trangThai) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.loaiNhanVien = loaiNhanVien;
        this.phai = phai;
        this.ngaySinh = ngaySinh;
        this.password = password;
        this.CCCD = CCCD;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
}
