/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.utils;
import java.sql.*;
/**
 *
 * @author admin
 */
public class Auth {
    public static boolean DangNhap(String TenDangNhap, String MatKhau){
        String sql = "SELECT * FROM nhanVien WHERE TenDangNhapNhanVien = ? and MatKhauNhanVien = ?"; 
        try (Connection con = ketNoiDB.getConnectDB();
                PreparedStatement ps = con.prepareStatement(sql);){
           ps.setString(1, TenDangNhap);
           ps.setString(2, MatKhau);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               GlobalState.tenNhanVien = rs.getString("tenNhanVien");
               GlobalState.vaiTro = rs.getBoolean("vaiTro");
               return true;
           }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
