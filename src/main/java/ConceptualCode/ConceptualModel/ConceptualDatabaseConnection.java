package ConceptualCode.ConceptualModel;

import java.sql.*;

public class ConceptualDatabaseConnection {

    public static void main(String[] args) {
        String url = "jdbc:mariadb://127.0.0.1/";
        String database = "customer_orders";
        String username = "root";
        String password = "mysql";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url + database, username, password);
            System.out.println("Got it!");
            String statment = "SELECT * from customer";
            PreparedStatement stmt = conn.prepareStatement(statment);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
