/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dto;

/**
 *
 * @author ACER
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String Gioitinh;
    private String Email;
    private String SDT;
    private String Passwd;
    private String NgSinh;
    private boolean TinhTrang;

    public NhanVien(String MaNV, String TenNV, String Gioitinh, String Email, String SDT, String Passwd, String NgSinh, boolean TinhTrang) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.Gioitinh = Gioitinh;
        this.Email = Email;
        this.SDT = SDT;
        this.Passwd = Passwd;
        this.NgSinh = NgSinh;
        this.TinhTrang = TinhTrang;
    }
    public NhanVien(){
        
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    public String getNgSinh() {
        return NgSinh;
    }

    public void setNgSinh(String NgSinh) {
        this.NgSinh = NgSinh;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
