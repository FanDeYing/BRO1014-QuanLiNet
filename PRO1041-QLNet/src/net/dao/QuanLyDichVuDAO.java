/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import net.entity.LoaiDichVu;
import net.utils.ketNoiDB;

/**
 *
 * @author Admin
 */
public class QuanLyDichVuDAO {

    public static List<LoaiDichVu> readLoaiDV() {
        List<LoaiDichVu> LoaiDVLst = new ArrayList();
        String sql = "Select * from LoaiDichVu";
        try (Connection con = ketNoiDB.getConnectDB();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int IDLoaiDichVu = rs.getInt("IDLoaiDichVu");
            String TenLoaiDichVu = rs.getString("TenLoaiDichVu");
            
            LoaiDichVu loaiDichVu = new LoaiDichVu(IDLoaiDichVu, TenLoaiDichVu);
            LoaiDVLst.add(loaiDichVu);
            }
            
            return LoaiDVLst;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return LoaiDVLst;

        }
    }










