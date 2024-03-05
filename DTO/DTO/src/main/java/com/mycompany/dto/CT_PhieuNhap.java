/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

/**
 *
 * @author ACER
 */
public class CT_PhieuNhap {
    private float SLNhap;
    private float DonGiaNhap;

    public CT_PhieuNhap(int SLNhap, float DonGiaNhap) {
        this.SLNhap = SLNhap;
        this.DonGiaNhap = DonGiaNhap;
    }

    public CT_PhieuNhap() {
    }

    public float getSLNhap() {
        return SLNhap;
    }

    public void setSLNhap(float SLNhap) {
        this.SLNhap = SLNhap;
    }

    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    public void setDonGiaNhap(float DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }
    
}
