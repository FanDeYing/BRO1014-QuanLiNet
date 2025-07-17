package net.entity;

public class LoaiDichVu {
    private int IdLoaiDichVu;
    private String TenLoaiDichVu;

    public LoaiDichVu() {
    }

    public LoaiDichVu(int IdLoaiDichVu, String TenLoaiDichVu) {
        this.IdLoaiDichVu = IdLoaiDichVu;
        this.TenLoaiDichVu = TenLoaiDichVu;
    }

    public int getIdLoaiDichVu() {
        return IdLoaiDichVu;
    }

    public void setIdLoaiDichVu(int IdLoaiDichVu) {
        this.IdLoaiDichVu = IdLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return TenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String TenLoaiDichVu) {
        this.TenLoaiDichVu = TenLoaiDichVu;
    }
    
    
}
