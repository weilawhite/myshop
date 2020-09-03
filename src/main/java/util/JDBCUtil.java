package util;

import java.sql.*;

public class JDBCUtil {
    Connection conn = null;

    private static String url = "jdbc:mysql://localhost:3306/myshop?characterEncoding=UTF-8";
    private static String user = "root";
    private static String password = "root";
    private static String driver = "com.mysql.jdbc.Driver";

    static {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn=null;
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
