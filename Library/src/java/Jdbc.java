

import java.sql.*;
import java.util.Properties;

public class Jdbc {

    Connection con;
    PreparedStatement psmnt = null;
    String sql;
    static String rst = "";
    boolean status = true;
    static ResultSet result_stat;
    static Statement st_stat;
    private static Properties prop;
    String user = "root";
    String password = "123";
    private String database = "test";
    String url = "jdbc:mysql://localhost:3306/" + database + "?useUnicode=true&amp;characterEncoding=UTF8;";

    public boolean connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
            status = true;
        } catch (Exception e) {
            status = false;
            System.out.println(e + "Driver error...");
        }

        return status;
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e + "connection close error");
        }
    }

    public boolean CreateTable(String sql) {
        try {
            Statement stms = con.createStatement();
            int i = stms.executeUpdate(sql);
            if (i == 1) {
                System.out.println("create table success");
                stms.close();
                status = true;
            }
        } catch (SQLException e) {
            System.out.println(e + "create table errorASDF");
            status = false;
        }
        return status;
    }

    public ResultSet ShowResult(String par) {
        try {
            st_stat = con.createStatement();
            result_stat = st_stat.executeQuery(par);
        } catch (SQLException e) {
            System.out.println(e + "show findResult error");

        }
        return result_stat;
    }

    public static void main(String sad[]) throws SQLException {
//        ResultSet rs = null;
//        Jdbc j = new Jdbc();
//        j.connection();
    }
}