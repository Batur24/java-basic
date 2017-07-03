package Utils;
import java.sql.*;

public class DataBase {

    public static Connection Connect() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://localhost:3306/springdemo";
        Connection conn = DriverManager.getConnection(url, "root", "369888");
        return conn;
    }

    public static void CloseConnect(Connection conn) throws SQLException{
        conn.close();
    }

    public static ResultSet Query(Connection conn, String statement) throws SQLException, ClassNotFoundException {
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(statement);
        return rs;
    }
}
