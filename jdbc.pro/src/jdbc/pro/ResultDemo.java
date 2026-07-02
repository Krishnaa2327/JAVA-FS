package jdbc.pro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultDemo {

    public static void main(String[] args) throws Exception {

        String sql = "SELECT * FROM customer";

        Connection conn = JdbcFactory.getConnection();

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        ResultSetMetaData meta = rs.getMetaData();

        // Print column names
        for (int i = 1; i <= meta.getColumnCount(); i++) {
            System.out.print(meta.getColumnName(i) + "\t");
        }
        System.out.println();

        // Print records
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("email") + "\t" +
                    rs.getString("phone") + "\t" +
                    rs.getString("city"));
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}