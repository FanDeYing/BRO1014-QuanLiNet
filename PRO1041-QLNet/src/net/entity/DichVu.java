package net.entity;

public class DichVu {
    private int IdDichVu;
    private String TenDichVu;
    private int IdLoaiDichVu;
    private boolean TrangThai;
    private float Gia;

    public DichVu() {
    }

    public DichVu(int IdDichVu, String TenDichVu, int IdLoaiDichVu, boolean TrangThai, float Gia) {
        this.IdDichVu = IdDichVu;
        this.TenDichVu = TenDichVu;
        this.IdLoaiDichVu = IdLoaiDichVu;
        this.TrangThai = TrangThai;
        this.Gia = Gia;
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

    public int getIdLoaiDichVu() {
        return IdLoaiDichVu;
    }

    public void setIdLoaiDichVu(int IdLoaiDichVu) {
        this.IdLoaiDichVu = IdLoaiDichVu;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    
}