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

        int sid = 7;
        String sname = "Mohan";
        int marks = 39;

        String url = "jdbc:postgresql://localhost:5432/Saran";
        String user = "postgres";
        String password = "Deepikasaran@2305";
//        String sql = "select * from students"; //Select
//        String sql = "insert into students values (6, 'Mosa', 20)"; //insert
//        String sql = "update students set sname = 'Deepak' where sid = 6"; //update
//        String sql = "delete from students where sid =6"; //delete
        String sql = "insert into students values (?, ?, ?)";

//    Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connections established");
//        Statement st = conn.createStatement();
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);

        st.execute();

//        ResultSet rs = st.executeQuery(sql);
//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getString(3));
//        }

        conn.close();
        System.out.println("Connection Closed");
    }



}
