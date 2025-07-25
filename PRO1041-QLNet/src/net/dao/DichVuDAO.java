/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.dao;

import java.util.ArrayList;
import java.util.List;
import net.dto.DichVuDTO;
import java.sql.*;
import java.time.*;
import net.dto.ThoiGianMay;
import net.entity.ChiTietHoaDon;
import net.utils.ketNoiDB;

/**
 *
 * @author admin
 */
public class DichVuDAO {

    public static List<DichVuDTO> readDichVu() {
        List<DichVuDTO> dichVuLst = new ArrayList<>();
        String sql = "select IdLoaiDichVu, IdDichVu, TenDichVu, Gia from dichVu";

        try (Connection con = ketNoiDB.getConnectDB(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int IDLoaiDichVu = rs.getInt("idLoaiDichVu");
                int IDDichVu = rs.getInt("idDichVu");
                String TenDichVu = rs.getString("TenDichVu");
                float Gia = rs.getFloat("Gia");

                DichVuDTO dichVu = new DichVuDTO(IDLoaiDichVu, IDDichVu, TenDichVu, Gia);
                dichVuLst.add(dichVu);
            }
            return dichVuLst;
        } catch (Exception e) {
        }
        return dichVuLst;
    }

    public static int themDichVu(ChiTietHoaDon HDDV) {
        String sqlCheck = "select * from ChiTietHoaDonDichVu where IdMay = ? and IdDichVu = ?";
        String sqlThem = "EXEC sp_InsertChiTietHoaDonDichVu ?,?,?,?,?";
        String sqlUpdate = "update ChiTietHoaDonDichVu set SoLuong = SoLuong + ? where IdMay = ? and IdDichVu = ?";
        try (Connection con = ketNoiDB.getConnectDB(); PreparedStatement psCheck = con.prepareStatement(sqlCheck)) {
            psCheck.setInt(1, HDDV.getIdMay());
            psCheck.setInt(2, HDDV.getIdDichVu());
            ResultSet rs = psCheck.executeQuery();

            if (rs.next()) {
                try (PreparedStatement psUpdate = con.prepareStatement(sqlUpdate)) {
                    psUpdate.setInt(1, HDDV.getSoLuong());
                    psUpdate.setInt(2, HDDV.getIdMay());
                    psUpdate.setInt(3, HDDV.getIdDichVu());

                    int ketQua = psUpdate.executeUpdate();
                    return ketQua;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try (PreparedStatement psThem = con.prepareStatement(sqlThem)) {
                    int IDChiTiet = HDDV.getIdMay() * 10 + HDDV.getIdDichVu();
                    psThem.setInt(1, IDChiTiet);
                    psThem.setInt(2, HDDV.getIdMay());
                    psThem.setInt(3, HDDV.getIdDichVu());
                    psThem.setInt(4, HDDV.getSoLuong());
                    psThem.setFloat(5, HDDV.getGia());

                    int ketQua = psThem.executeUpdate();
                    return ketQua;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static List<ThoiGianMay> readTGMay(int IdMay) {
        List<ThoiGianMay> tgMayLst = new ArrayList();
        String sql = "select m.TrangThaiMay, hd.NgayTao, hd.GioBatDau, hd.GioKetThuc, hd.TongGioChoi \n"
                + "from HoaDon HD \n"
                + "join may m on HD.IDMay = m .IdMay\n"
                + "where m.IdMay = ?";
        try (Connection con = ketNoiDB.getConnectDB(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, IdMay);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Boolean trangThaiMay = rs.getBoolean("TrangThaiMay");
                LocalDate NgayTao = rs.getObject("NgayTao", LocalDate.class);
                LocalTime gioBatDau = rs.getObject("GioBatDau", LocalTime.class);
                LocalTime gioKetThuc = rs.getObject("GioKetThuc", LocalTime.class);
                float tongGio = rs.getFloat("TongGioChoi");

                ThoiGianMay tgMay = new ThoiGianMay(trangThaiMay, NgayTao, gioBatDau, gioKetThuc, tongGio);
                tgMayLst.add(tgMay);
            }
            return tgMayLst;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tgMayLst;
    }
    
    public static int setTrangThai(boolean trangThaiMay, int IDMay){
        String sql = "update may set trangThaiMay = ? where IDMay = ?";
        try (Connection con = ketNoiDB.getConnectDB();
                PreparedStatement ps = con.prepareStatement(sql)){
            ps.setBoolean(1, trangThaiMay);
            ps.setInt(2, IDMay);
            int ketQua = ps.executeUpdate();
            return ketQua;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static int addTGMay(ThoiGianMay tgm, int IDMay){
//        String sqlCheck = "Select * from ";
        String sqlThem = "insert into ThoiGianMay values (?,?,?,?,?,?)";
        try (Connection con = ketNoiDB.getConnectDB();
                PreparedStatement ps = con.prepareStatement(sqlThem)){
            ps.setInt(1, IDMay);
            ps.setBoolean(2, tgm.isTrangThaiMay());
            ps.setDate(3, java.sql.Date.valueOf(tgm.getNgayTao()));
            ps.setTime(4, java.sql.Time.valueOf(tgm.getGioBatDau()));
            ps.setTime(5, java.sql.Time.valueOf(tgm.getGioKetThuc()));
            ps.setFloat(6, tgm.getTongGio());
            
            int ketQua = ps.executeUpdate();
            return ketQua;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
