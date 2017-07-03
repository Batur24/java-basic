package Model;
import Utils.DataBase.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Utils.DataBase.CloseConnect;
import static Utils.DataBase.Connect;
import static Utils.DataBase.Query;

/**
 * Created by batur on 2017/7/3.
 */
public class User {
    public int id;
    public String userid;
    public String username;

    public static User Get(String userid) throws SQLException, ClassNotFoundException {
        Connection conn = Connect();
        ResultSet rs = Query(conn,"select * from user where userid='"+userid+"'");
        User user = new User();
        while (rs.next()){
            user.id = rs.getInt("id");
            user.userid = rs.getString("userid");
            user.username = rs.getString("username");
        }
        CloseConnect(conn);
        return user;
    }
}
