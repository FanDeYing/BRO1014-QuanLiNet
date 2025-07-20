package net.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ketNoiDB {
    public static Connection getConnectDB() throws SQLException{
        String urlSQL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLiQuanNet;"
                + "user=sa;password=1234;encrypt=true;"
                + "trustServerCertificate=true";
        Connection con = DriverManager.getConnection(urlSQL);

        // In tên CSDL đang kết nối ra console
        System.out.println(" Đã kết nối tới CSDL: " + con.getCatalog());

        return con;
    }
}
