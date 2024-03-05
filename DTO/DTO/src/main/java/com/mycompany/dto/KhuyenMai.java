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
public class KhuyenMai {
    private String MaKM;
    private float TiLeGiam;
    private Timestamp NgBD;
    private Timestamp NgKT;
    private boolean TinhTrang;

    public KhuyenMai(String MaKM, float TiLeGiam, Timestamp NgBD, Timestamp NgKT, boolean TinhTrang) {
        this.MaKM = MaKM;
        this.TiLeGiam = TiLeGiam;
        this.NgBD = NgBD;
        this.NgKT = NgKT;
        this.TinhTrang = TinhTrang;
    }

    public KhuyenMai() {
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public float getTiLeGiam() {
        return TiLeGiam;
    }

    public void setTiLeGiam(float TiLeGiam) {
        this.TiLeGiam = TiLeGiam;
    }

    public Timestamp getNgBD() {
        return NgBD;
    }

    public void setNgBD(Timestamp NgBD) {
        this.NgBD = NgBD;
    }

    public Timestamp getNgKT() {
        return NgKT;
    }

    public void setNgKT(Timestamp NgKT) {
        this.NgKT = NgKT;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
