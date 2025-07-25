
package net.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import net.entity.May;
import net.utils.ketNoiDB;

public class MayDAO {
    public static List<May> readMay(){
        List<May> mayLst = new ArrayList<>();
        String sql = "select * from May";
        
        try (Connection con = ketNoiDB.getConnectDB();
                PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int IDMay = rs.getInt("idMay");
                boolean trangThaiMay = rs.getBoolean("TrangThaiMay");
                float gia = rs.getFloat("gia");
                
                May may = new May(IDMay, trangThaiMay, gia);
                mayLst.add(may);
            }
            return mayLst;
        } catch (Exception e) {
        }
        return mayLst;
    }
}
