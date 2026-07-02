package jdbc.pro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            Connection conn = JdbcFactory.getConnection();

            CallableStatement stmt =
                    conn.prepareCall("{? = call get_name(?)}");

            stmt.setInt(2, 1);
            stmt.registerOutParameter(1, Types.VARCHAR);

            stmt.execute();

            System.out.println("Name: " + stmt.getString(1));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}