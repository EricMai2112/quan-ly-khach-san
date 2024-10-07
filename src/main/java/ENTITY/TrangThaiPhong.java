/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ENTITY;

/**
 *
 * @author 84837
 */
public enum TrangThaiPhong {
    PHONG_BAN("Phong dang hoat dong"), PHONG_DO("Phong chua duoc ve sinh"), PHONG_TRONG("Phong trong"), PHONG_SUA("Phong dang sua chua");
    
    private String trangThaiPhong;

    TrangThaiPhong(String trangThaiPhong) {
        this.trangThaiPhong = trangThaiPhong;
    }

    @Override
    public String toString() {
        return trangThaiPhong;
    }
}
