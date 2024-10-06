/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84837
 */
public class NhanVien_DAO {
    List<NhanVien> nhanVien;
    
    public NhanVien_DAO(){
        super();
        this.nhanVien = new ArrayList<>();
    }

    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }

    public int getCurrentSize(){
        return nhanVien.size();
    }
    
    public boolean themNhanVien(NhanVien nhanVienMoi){
        if(!nhanVien.contains(nhanVienMoi) && nhanVienMoi.getTrangThai()) 
            return nhanVien.add(nhanVienMoi);
        else 
            return false;
    }
    
    public void themTatCaNhanVien(List<NhanVien> danhSachNhanVien){
        danhSachNhanVien.forEach(x -> {
            if(!nhanVien.contains(x)){
                nhanVien.add(x);
            }
        });
    }
    public NhanVien timKiem(String id){
        return nhanVien.stream().filter(x -> x.getMaNhanVien().equalsIgnoreCase(id)).findFirst().orElse(null);
    }
    
    public boolean xoaNhanVien(String id){
        NhanVien temp = timKiem(id);
        if(temp == null)
               return false;
        else
            return nhanVien.remove(temp);
    } 
}
