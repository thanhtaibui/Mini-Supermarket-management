/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;
import java.awt.Image;
import java.security.Timestamp;


public class HangHoa {
    private String MaHH;
    private String TenHH;
    private Timestamp NgaySX;
    private Timestamp HSD;
    private float DonGiaBan;
    private float SoLuong;
    private Image HinhAnh;
    private String DonVi;
    private boolean TinhTrang;
    

    public HangHoa(String MaHH, String TenHH, Timestamp NgaySX, Timestamp HSD, float DonGiaBan, float SoLuong, Image HinhAnh, String DonVi, boolean TinhTrang) {
        this.MaHH = MaHH;
        this.TenHH = TenHH;
        this.NgaySX = NgaySX;
        this.HSD = HSD;
        this.DonGiaBan = DonGiaBan;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
        this.DonVi = DonVi;
        this.TinhTrang = TinhTrang;
    }

    

    public HangHoa() {
    }

    public String getMaHH() {
        return MaHH;
    }

    public void setMaHH(String MaHH) {
        this.MaHH = MaHH;
    }

    public String getTenHH() {
        return TenHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public Timestamp getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Timestamp NgaySX) {
        this.NgaySX = NgaySX;
    }

    public Timestamp getHSD() {
        return HSD;
    }

    public void setHSD(Timestamp HSD) {
        this.HSD = HSD;
    }

    
    public float getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(float DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    public float getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Image getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(Image HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
