
package net.dto;


public class DichVuDTO1 {
    private int IdDichVu;
    private String TenDichVu;
    private int SoLuong;
    private float giaDichVu;
    private float TongTien;

    public DichVuDTO1() {
    }

    public DichVuDTO1(int IdDichVu, String TenDichVu, int SoLuong, float giaDichVu, float TongTien) {
        this.IdDichVu = IdDichVu;
        this.TenDichVu = TenDichVu;
        this.SoLuong = SoLuong;
        this.giaDichVu = giaDichVu;
        this.TongTien = TongTien;
    }

    public int getIdDichVu() {
        return IdDichVu;
    }

    public void setIdDichVu(int IdDichVu) {
        this.IdDichVu = IdDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
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
