CREATE DATABASE QuanLiQuanNet

USE QuanLiQuanNet

-- Bảng nhân viên
CREATE TABLE nhanVien (
IdNhanVien INT PRIMARY KEY,
tenNhanVien NVARCHAR(50) NOT NULL,
tenDangNhapNhanVien NVARCHAR(50) NOT NULL,
matKhauNhanVien NVARCHAR(20) NOT NULL,
vaiTro BIT,
)
-- Bảng máy
CREATE TABLE May (
IdMay INT PRIMARY KEY,
TrangThaiMay NVARCHAR(50) NOT NULL,
gia MONEY
)
-- Bảng Loại Dịch Vụ
CREATE TABLE LoaiDichVu (
IdLoaiDichVu INT PRIMARY KEY,
TenLoaiDichVu NVARCHAR(100)
)
-- Bảng Dịch Vụ
CREATE TABLE DichVu (
IdDichVu INT PRIMARY KEY,
TenDichVu NVARCHAR(100),
IdLoaiDichVu INT,
TrangThai BIT,
Gia MONEY,
FOREIGN KEY (IdLoaiDichVu) REFERENCES LoaiDichVu(IdLoaiDichVu)
)
-- Bảng Chi tiết hóa đơn
CREATE TABLE HoaDonDichVu(
IdHoaDonDichVu INT PRIMARY KEY,
IdDichVu INT,
SoLuong INT,
Gia MONEY,
TenHDCT NVARCHAR(100),
FOREIGN KEY (IdDichVu) REFERENCES DichVu(IdDichVu),
)
-- Bảng Hóa đơn
CREATE TABLE HoaDon (
IdHoaDon INT PRIMARY KEY,
NgayTao DATETIME,
GioBatDau DATETIME,
GioKetThuc DATETIME,
TongGioChoi FLOAT,
TongTien MONEY,
IdNhanVien INT,
IdMay INT,
IdHoaDonDichVu INT,
FOREIGN KEY (IdNhanVien) REFERENCES NhanVien(IdNhanVien),
FOREIGN KEY (IdMay) REFERENCES May(IdMay),
FOREIGN KEY (IdHoaDonDichVu) REFERENCES HoaDonDichVu(IdHoaDonDichVu)
)

drop table HoaDonDichVu