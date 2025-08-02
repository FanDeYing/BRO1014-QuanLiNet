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
     public static int createHoaDon(HoaDonDTO hoaDon ,int idMay){
       String sql = "INSERT INTO HoaDon VALUES (?,?,?,?,?,?,?,?,?)";
       try (Connection con = ketNoiDB.getConnectDB();
               PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, hoaDon.getIdHoaDon());
            ps.setInt(2,hoaDon.getIdMay());
            ps.setDate(3,new java.sql.Date(hoaDon.getNgayTao().getTime()));
            ps.setTime(4,hoaDon.getGioBatDau());
            ps.setTime(5,hoaDon.getGioKetThuc());
            ps.setFloat(6, hoaDon.getTongGioChoi());
            ps.setFloat(7, hoaDon.getGiaMay());
            ps.setFloat(8, hoaDon.getGiaDichVu());
            ps.setFloat(9, hoaDon.getTongTien());
            int ketQua =ps.executeUpdate();
            return ketQua;
           
       } catch (Exception e) {
             return 0;
       }
     
   }
}
