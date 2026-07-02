package jdbc.pro;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedDemo {

    public static void main(String[] args) throws Exception {

        String sql = "INSERT INTO customer (name, email, phone, city) VALUES (?, ?, ?, ?)";

        Connection conn = JdbcFactory.getConnection();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, args[0]); // name
        stmt.setString(2, args[1]); // email
        stmt.setString(3, args[2]); // phone
        stmt.setString(4, args[3]); // city

        int rows = stmt.executeUpdate();

        System.out.println(rows + " row(s) inserted.");

        stmt.close();
        conn.close();
    }
}