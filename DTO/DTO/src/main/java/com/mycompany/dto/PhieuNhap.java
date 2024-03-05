/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

/**
 *
 * @author ACER
 */
public class PhieuNhap {
    private String MaPN;
    private String NgLapPhieu;
    private boolean TinhTrang;

    public PhieuNhap(String MaPN, String NgLapPhieu, boolean TinhTrang) {
        this.MaPN = MaPN;
        this.NgLapPhieu = NgLapPhieu;
        this.TinhTrang = TinhTrang;
    }
    public PhieuNhap() {
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getNgLapPhieu() {
        return NgLapPhieu;
    }

    public void setNgLapPhieu(String NgLapPhieu) {
        this.NgLapPhieu = NgLapPhieu;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
