/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

/**
 *
 * @author ACER
 */
public class NhomQuyen {
    private String MaQuyen;
    private String TenQuyen;
    private String Mota;

    public NhomQuyen(String MaQuyen, String TenQuyen, String Mota) {
        this.MaQuyen = MaQuyen;
        this.TenQuyen = TenQuyen;
        this.Mota = Mota;
    }

    public NhomQuyen() {
    }

    public String getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen(String MaQuyen) {
        this.MaQuyen = MaQuyen;
    }

    public String getTenQuyen() {
        return TenQuyen;
    }

    public void setTenQuyen(String TenQuyen) {
        this.TenQuyen = TenQuyen;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    
}
