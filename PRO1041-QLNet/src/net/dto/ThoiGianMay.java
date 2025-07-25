/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.dto;

import java.time.*;


/**
 *
 * @author admin
 */
public class ThoiGianMay {
    private boolean trangThaiMay;
    private LocalDate ngayTao;
    private LocalTime gioBatDau;
    private LocalTime gioKetThuc;
    private float tongGio;

    public ThoiGianMay() {
    }

    public ThoiGianMay(boolean trangThaiMay, LocalDate ngayTao, LocalTime gioBatDau, LocalTime gioKetThuc, float tongGio) {
        this.trangThaiMay = trangThaiMay;
        this.ngayTao = ngayTao;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
        this.tongGio = tongGio;
    }

    public boolean isTrangThaiMay() {
        return trangThaiMay;
    }

    public void setTrangThaiMay(boolean trangThaiMay) {
        this.trangThaiMay = trangThaiMay;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public LocalTime getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(LocalTime gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public LocalTime getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(LocalTime gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public float getTongGio() {
        return tongGio;
    }

    public void setTongGio(float tongGio) {
        this.tongGio = tongGio;
    }
    
}
