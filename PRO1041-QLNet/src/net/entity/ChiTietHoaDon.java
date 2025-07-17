package net.entity;

/**
 *
 * @author admin
 */
public class ChiTietHoaDon{
    private int IdChiTiet;
    private int IdMay;
    private int IdDichVu;
    private int SoLuong;
    private float Gia;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int IdChiTiet, int IdMay, int IdDichVu, int SoLuong, float Gia) {
        this.IdChiTiet = IdChiTiet;
        this.IdMay = IdMay;
        this.IdDichVu = IdDichVu;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public int getIdChiTiet() {
        return IdChiTiet;
    }

    public void setIdChiTiet(int IdChiTiet) {
        this.IdChiTiet = IdChiTiet;
    }

    public int getIdMay() {
        return IdMay;
    }

    public void setIdMay(int IdMay) {
        this.IdMay = IdMay;
    }

    public int getIdDichVu() {
        return IdDichVu;
    }

    public void setIdDichVu(int IdDichVu) {
        this.IdDichVu = IdDichVu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    
}
