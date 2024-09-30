/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

/**
 *
 * @author 84837
 */
public class Phong {
    private String maPhong;
    private LoaiPhong loaiPhong;
    private int soNguoi;
    private TrangThaiPhong trangThaiPhong;
    
    public Phong(){
        
    }

    public Phong(String maPhong, LoaiPhong loaiPhong, int soNguoi, TrangThaiPhong trangThaiPhong) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soNguoi = soNguoi;
        this.trangThaiPhong = trangThaiPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public TrangThaiPhong getTrangThaiPhong() {
        return trangThaiPhong;
    }

    public void setTrangThaiPhong(TrangThaiPhong trangThaiPhong) {
        this.trangThaiPhong = trangThaiPhong;
    }
    
    
}
