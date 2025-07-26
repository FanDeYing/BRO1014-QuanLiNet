
package net.dao;
import java.sql.*;
import net.utils.ketNoiDB;
import java.util.*;
import net.entity.DichVu;
import net.dto.DichVuDTO1;
import net.dto.ThanhToanDTO;
public class DichVuDAO1 {
    public static List<DichVuDTO1> readDichVu(){
        List<DichVuDTO1> dichVuDTOLST = new ArrayList<>();
        String sql = "SELECT \n" +
"    dv.IdDichVu ,\n" +
"    dv.TenDichVu ,\n" +
"    cthd.SoLuong ,\n" +
"    cthd.Gia AS 'giaDichVu',\n" +
"    hd.TongTien \n" +
"FROM \n" +
"    DichVu dv\n" +
"INNER JOIN \n" +
"    ChiTietHoaDonDichVu cthd ON dv.IdDichVu = cthd.IdDichVu\n" +
"INNER JOIN \n" +
"    HoaDon hd ON cthd.IdChiTiet = hd.IdChiTiet";
        try (Connection con = ketNoiDB.getConnectDB();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int IdDichVu = rs.getInt("IdDichVu");
                String TenDichVu = rs.getString("TenDichVu");
                int SoLuong = rs.getInt("SoLuong");
                float giaDichVu = rs.getFloat("giaDichVu");
                float TongTien = rs.getFloat("TongTien");
                
                DichVuDTO1 dichVu = new DichVuDTO1(IdDichVu, TenDichVu, SoLuong, giaDichVu, TongTien);
                dichVuDTOLST.add(dichVu);
            }
        } catch (Exception e) {
             e.printStackTrace();
            return dichVuDTOLST;
        }
             return dichVuDTOLST;
    }


}
