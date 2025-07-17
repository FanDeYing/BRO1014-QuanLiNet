package net.entity;

public class NhanVien {

    private int IdNhanVien;
    private String tenNhanVien;
    private String tenDangNhapNhanVien;
    private String matKhauNhanVien;
    private boolean vaiTro;

    public NhanVien() {
    }

    public NhanVien(int IdNhanVien, String tenNhanVien, String tenDangNhapNhanVien, String matKhauNhanVien, boolean vaiTro) {
        this.IdNhanVien = IdNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tenDangNhapNhanVien = tenDangNhapNhanVien;
        this.matKhauNhanVien = matKhauNhanVien;
        this.vaiTro = vaiTro;
    }

    public int getIdNhanVien() {
        return IdNhanVien;
    }

    public void setIdNhanVien(int IdNhanVien) {
        this.IdNhanVien = IdNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenDangNhapNhanVien() {
        return tenDangNhapNhanVien;
    }

    public void setTenDangNhapNhanVien(String tenDangNhapNhanVien) {
        this.tenDangNhapNhanVien = tenDangNhapNhanVien;
    }

    public String getMatKhauNhanVien() {
        return matKhauNhanVien;
    }

    public void setMatKhauNhanVien(String matKhauNhanVien) {
        this.matKhauNhanVien = matKhauNhanVien;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    
}