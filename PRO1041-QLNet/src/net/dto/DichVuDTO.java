/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.dto;

/**
 *
 * @author admin
 */
public class DichVuDTO {
    private int IDLoaiDichVu;
    private int IDDichVu;
    private String TenDichVu;
    private Float Gia;

    public int getIDLoaiDichVu() {
        return IDLoaiDichVu;
    }

    public void setIDLoaiDichVu(int IDLoaiDichVu) {
        this.IDLoaiDichVu = IDLoaiDichVu;
    }

    public int getIDDichVu() {
        return IDDichVu;
    }

    public void setIDDichVu(int IDDichVu) {
        this.IDDichVu = IDDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public Float getGia() {
        return Gia;
    }

    public void setGia(Float Gia) {
        this.Gia = Gia;
    }

    public DichVuDTO(int IDLoaiDichVu, int IDDichVu, String TenDichVu, Float Gia) {
        this.IDLoaiDichVu = IDLoaiDichVu;
        this.IDDichVu = IDDichVu;
        this.TenDichVu = TenDichVu;
        this.Gia = Gia;
    }

    public DichVuDTO() {
    }
}
