/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.entity;
import java.util.Date;
import java.sql.Time;
/**
 *
 * @author admin
 */
public class HoaDon {
    private int IdHoaDon;
    private int IdChiTiet;
    private Date NgayTao;
    private Time GioBatDau;
    private Time GioKetThuc;
    private float TongGioChoi;
    private float TongTien;
    private int IdNhanVien;

    public HoaDon() {
    }

    public HoaDon(int IdHoaDon, int IdChiTiet, Date NgayTao, Time GioBatDau, Time GioKetThuc, float TongGioChoi, float TongTien, int IdNhanVien) {
        this.IdHoaDon = IdHoaDon;
        this.IdChiTiet = IdChiTiet;
        this.NgayTao = NgayTao;
        this.GioBatDau = GioBatDau;
        this.GioKetThuc = GioKetThuc;
        this.TongGioChoi = TongGioChoi;
        this.TongTien = TongTien;
        this.IdNhanVien = IdNhanVien;
    }

    public int getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(int IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public int getIdChiTiet() {
        return IdChiTiet;
    }

    public void setIdChiTiet(int IdChiTiet) {
        this.IdChiTiet = IdChiTiet;
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

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public int getIdNhanVien() {
        return IdNhanVien;
    }

    public void setIdNhanVien(int IdNhanVien) {
        this.IdNhanVien = IdNhanVien;
    }
    
    
}