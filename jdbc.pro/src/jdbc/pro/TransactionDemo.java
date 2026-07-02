package jdbc.pro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String sql1 = "INSERT INTO customer (name, email, phone, city) VALUES ('Rohan', 'rohan@gmail.com', '9876543211', 'Pune')";
        String sql2 = "UPDATE customer SET city='Mumbai' WHERE name='Polo'";
        String sql3 = "DELETE FROM customer WHERE name='Sneha Joshi'";

        Connection conn = null;
        try {
            conn = JdbcFactory.getConnection();
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.executeBatch();
            conn.commit();

            System.out.println("Transaction Completed Successfully.");
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Transaction Failed.");
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Rollback Successful.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}