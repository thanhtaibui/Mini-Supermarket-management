/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.security.Timestamp;

/**
 *
 * @author ACER
 */
public class HoaDonBanHang {
    
    private String MaHD;
    private Timestamp NgLap;
    private float ThanhTien; 

    public HoaDonBanHang(String MaHD, Timestamp NgLap, float ThanhTien) {
        this.MaHD = MaHD;
        this.NgLap = NgLap;
        this.ThanhTien = ThanhTien;
    }

    public HoaDonBanHang() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Timestamp getNgLap() {
        return NgLap;
    }

    public void setNgLap(Timestamp NgLap) {
        this.NgLap = NgLap;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
