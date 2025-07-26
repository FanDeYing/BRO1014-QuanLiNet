package net.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.Date;
import net.entity.HoaDon;
import net.utils.ketNoiDB;
import java.util.*;
import net.dto.HoaDonDTO;
import net.dto.ThanhToanDTO;

public class HoaDonDAO {

    public static List<HoaDonDTO> readHoaDon() {
        List<HoaDonDTO> lstHDDTO = new ArrayList<>();
        String sql = "SELECT HD.IdHoaDon, HD.NgayTao, HD.GioBatDau, HD.GioKetThuc, HD.TongGioChoi, HD.TongTien, "
                + "CTHD.IdMay, M.Gia AS giaMay, DV.Gia AS giaDichVu "
                + "FROM HoaDon HD "
                + "INNER JOIN ChiTietHoaDonDichVu CTHD ON HD.IdChiTiet = CTHD.IdChiTiet "
                + "INNER JOIN May M ON CTHD.IdMay = M.IdMay "
                + "INNER JOIN DichVu DV ON CTHD.IdDichVu = DV.IdDichVu "
                + "INNER JOIN LoaiDichVu LDV ON DV.IdLoaiDichVu = LDV.IdLoaiDichVu";

        try (Connection con = ketNoiDB.getConnectDB(); PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int IdHoaDon = rs.getInt("IdHoaDon");
                int IdMay = rs.getInt("IdMay");
                Date NgayTao = rs.getDate("NgayTao");
                Time GioBatDau = rs.getTime("GioBatDau");
                Time GioKetThuc = rs.getTime("GioKetThuc");
                float TongGioChoi = rs.getFloat("TongGioChoi");
                float giaMay = rs.getFloat("giaMay");
                float giaDichVu = rs.getFloat("giaDichVu");
                float TongTien = rs.getFloat("TongTien");
                HoaDonDTO hdDTO = new HoaDonDTO(IdHoaDon, IdMay, NgayTao, GioBatDau, GioKetThuc, TongGioChoi, giaMay, giaMay, TongTien);
                lstHDDTO.add(hdDTO);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return lstHDDTO;
        }
        return lstHDDTO;

    }
}
