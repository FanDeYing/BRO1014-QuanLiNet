
package net.dto;

import java.util.Date;
import java.sql.Time;

public class ThanhToanDTO {
    private int IdHoaDon;
    private int IdMay;
    private Date NgayTao;
    private Time GioBatDau;
    private Time GioKetThuc;
    private float TongGioChoi;
    private float giaMay;
    private float giaDichVu;
    private float TongTien;

    public ThanhToanDTO() {
    }

    public ThanhToanDTO(int IdHoaDon, int IdMay, Date NgayTao, Time GioBatDau, Time GioKetThuc, float TongGioChoi, float giaMay, float giaDichVu, float TongTien) {
        this.IdHoaDon = IdHoaDon;
        this.IdMay = IdMay;
        this.NgayTao = NgayTao;
        this.GioBatDau = GioBatDau;
        this.GioKetThuc = GioKetThuc;
        this.TongGioChoi = TongGioChoi;
        this.giaMay = giaMay;
        this.giaDichVu = giaDichVu;
        this.TongTien = TongTien;
    }

    public int getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(int IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public int getIdMay() {
        return IdMay;
    }

    public void setIdMay(int IdMay) {
        this.IdMay = IdMay;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Time getGioBatDau() {
        return GioBatDau;
    }

    public void setGioBatDau(Time GioBatDau) {
        this.GioBatDau = GioBatDau;
    }

    public Time getGioKetThuc() {
        return GioKetThuc;
    }

    public void setGioKetThuc(Time GioKetThuc) {
        this.GioKetThuc = GioKetThuc;
    }

    public float getTongGioChoi() {
        return TongGioChoi;
    }

    public void setTongGioChoi(float TongGioChoi) {
        this.TongGioChoi = TongGioChoi;
    }

    public float getGiaMay() {
        return giaMay;
    }

    public void setGiaMay(float giaMay) {
        this.giaMay = giaMay;
    }

    public float getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(float giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }
    
}
