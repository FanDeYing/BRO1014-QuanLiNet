CREATE DATABASE QuanLiQuanNet
USE QuanLiQuanNet

-- Bảng nhân viên
CREATE TABLE nhanVien (
IdNhanVien INT PRIMARY KEY,
tenNhanVien NVARCHAR(50) NOT NULL,
tenDangNhapNhanVien NVARCHAR(50) NOT NULL,
matKhauNhanVien NVARCHAR(20) NOT NULL,
vaiTro BIT NOT NULL,
)
-- Bảng máy
CREATE TABLE May (
IdMay INT PRIMARY KEY,
TrangThaiMay BIT NOT NULL,
gia MONEY NOT NULL
)
-- Bảng Loại Dịch Vụ
CREATE TABLE LoaiDichVu (
IdLoaiDichVu INT PRIMARY KEY,
TenLoaiDichVu NVARCHAR(100) NOT NULL
)
-- Bảng Dịch Vụ
CREATE TABLE DichVu (
IdDichVu INT PRIMARY KEY,
TenDichVu NVARCHAR(100) NOT NULL,
IdLoaiDichVu INT NOT NULL,
TrangThai BIT NOT NULL,
Gia MONEY NOT NULL,
FOREIGN KEY (IdLoaiDichVu) REFERENCES LoaiDichVu(IdLoaiDichVu)
)
-- Bảng Chi tiết hóa đơn
CREATE TABLE ChiTietHoaDonDichVu (
    IdChiTiet INT PRIMARY KEY,
	IdMay INT NOT NULL,
    IdDichVu INT NOT NULL,
    SoLuong INT NOT NULL,
    Gia MONEY NOT NULL,
    FOREIGN KEY (IdMay) REFERENCES May(IdMay),
    FOREIGN KEY (IdDichVu) REFERENCES DichVu(IdDichVu)
)
-- Bảng Hóa đơn
CREATE TABLE HoaDon (
    IdHoaDon INT PRIMARY KEY,
	IdChiTiet INT NOT NULL,
    NgayTao DATE NOT NULL,
    GioBatDau TIME NOT NULL,
    GioKetThuc TIME NOT NULL,
    TongGioChoi FLOAT,
    TongTien MONEY,
    IdNhanVien INT NOT NULL,
    FOREIGN KEY (IdNhanVien) REFERENCES NhanVien(IdNhanVien),
    FOREIGN KEY (IdChiTiet) REFERENCES ChiTietHoaDonDichVu(IdChiTiet)
)
-- Thêm nhân viên
CREATE PROCEDURE sp_InsertNhanVien
    @IdNhanVien INT,
    @TenNhanVien NVARCHAR(50),
    @TenDangNhap NVARCHAR(50),
    @MatKhau NVARCHAR(255),
    @VaiTro BIT      -- 1 = Admin, 0 = Nhân viên
AS
BEGIN
    INSERT INTO nhanVien (IdNhanVien, tenNhanVien, tenDangNhapNhanVien, matKhauNhanVien, vaiTro)
    VALUES (@IdNhanVien, @TenNhanVien, @TenDangNhap, @MatKhau, @VaiTro)
END
-- Admin
EXEC sp_InsertNhanVien 1, N'Admin', N'admin01', N'ad123', 1
-- Nhân viên thường
EXEC sp_InsertNhanVien 2, N'Nguyễn Tiến Đức', N'duc123', N'duc1234', 0
EXEC sp_InsertNhanVien 3, N'Đoàn Văn Ngọc', N'ngoc123', N'ngoc1234', 0

-- Thêm máy
CREATE PROCEDURE sp_InsertMay
    @IdMay INT,
    @TrangThaiMay BIT,
    @Gia MONEY
AS
BEGIN
    INSERT INTO May (IdMay, TrangThaiMay, gia)
    VALUES (@IdMay, @TrangThaiMay, @Gia)
END

EXEC sp_InsertMay 1, 0, 10000
EXEC sp_InsertMay 2, 1, 10000
EXEC sp_InsertMay 3, 0, 12000
EXEC sp_InsertMay 4, 1, 15000
EXEC sp_InsertMay 5, 0, 9000

-- Thêm loại dịch vụ
CREATE PROCEDURE sp_InsertLoaiDichVu
    @IdLoaiDichVu INT,
    @TenLoaiDichVu NVARCHAR(100)
AS
BEGIN
    INSERT INTO LoaiDichVu (IdLoaiDichVu, TenLoaiDichVu)
    VALUES (@IdLoaiDichVu, @TenLoaiDichVu)
END

EXEC sp_InsertLoaiDichVu 1, N'Nước uống'
EXEC sp_InsertLoaiDichVu 2, N'Đồ ăn nhẹ'
EXEC sp_InsertLoaiDichVu 3, N'Thẻ game'
EXEC sp_InsertLoaiDichVu 4, N'Phụ kiện'
EXEC sp_InsertLoaiDichVu 5, N'Dịch vụ khác'

-- Thêm dịch vụ
CREATE PROCEDURE sp_InsertDichVu
    @IdDichVu INT,
    @TenDichVu NVARCHAR(100),
    @IdLoaiDichVu INT,
    @TrangThai BIT,
    @Gia MONEY
AS
BEGIN
    INSERT INTO DichVu (IdDichVu, TenDichVu, IdLoaiDichVu, TrangThai, Gia)
    VALUES (@IdDichVu, @TenDichVu, @IdLoaiDichVu, @TrangThai, @Gia)
END

EXEC sp_InsertDichVu 1, N'Coca Cola',       1, 1, 10000
EXEC sp_InsertDichVu 2, N'Mì Hảo Hảo',       2, 1, 15000
EXEC sp_InsertDichVu 3, N'Thẻ Garena 100k',  3, 1, 100000
EXEC sp_InsertDichVu 4, N'Tai nghe mini',    4, 1, 50000
EXEC sp_InsertDichVu 5, N'In tài liệu',      5, 1, 3000

-- Thêm hóa đơn chi tiết
CREATE PROCEDURE sp_InsertChiTietHoaDonDichVu
    @IdChiTiet INT ,
	@IdMay INT ,
    @IdDichVu INT ,
    @SoLuong INT ,
    @Gia MONEY
AS
BEGIN
    INSERT INTO ChiTietHoaDonDichVu (IdChiTiet, IdMay, IdDichVu, SoLuong, Gia)
    VALUES (@IdChiTiet, @IdMay, @IdDichVu, @SoLuong, @Gia)
END

EXEC sp_InsertChiTietHoaDonDichVu 001,1,1,3,10000

-- Thêm hóa đơn
CREATE PROCEDURE sp_InsertHoaDon
    @IdHoaDon INT ,
	@IdChiTiet INT ,
    @NgayTao DATE ,
    @GioBatDau TIME ,
    @GioKetThuc TIME ,
    @TongGioChoi FLOAT,
    @TongTien MONEY,
    @IdNhanVien INT
AS
BEGIN
    INSERT INTO HoaDon
    VALUES (@IdHoaDon,@IdChiTiet, @NgayTao, @GioBatDau, @GioKetThuc, @TongGioChoi, @TongTien, @IdNhanVien)
END

DROP PROCEDURE sp_InsertHoaDon
EXEC sp_InsertHoaDon 1,1, '2025-07-16', '10:00:00', '12:00:00', 2.0, 20000, 1;



