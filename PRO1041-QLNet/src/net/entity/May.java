package net.entity;

public class May {
    private int IdMay;
    private boolean TrangThaiMay;
    private float gia;

    public May(int IdMay, boolean TrangThaiMay, float gia) {
        this.IdMay = IdMay;
        this.TrangThaiMay = TrangThaiMay;
        this.gia = gia;
    }

    public May() {
    }

    public int getIdMay() {
        return IdMay;
    }

    public void setIdMay(int IdMay) {
        this.IdMay = IdMay;
    }

    public boolean isTrangThaiMay() {
        return TrangThaiMay;
    }

    public void setTrangThaiMay(boolean TrangThaiMay) {
        this.TrangThaiMay = TrangThaiMay;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    

  
}
