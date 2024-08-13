import java.sql.*;

public class PostgresqlDemo {
    public static void main(String[] args) throws Exception {
        /*
         * Import package
         * Load and Register driver
         * Create connection
         * Create Statement
         * Execute statement
         * Close
         * */

        String url = "jdbc:postgresql://localhost:5432/Saran";
        String user = "postgres";
        String password = "Deepikasaran@2305";
        String sql = "select * from students";

//    Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connections established");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the student is " + name);

        while (rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getString(3));
        }
        conn.close();
        System.out.println("Connection Closed");
    }



}
