package Sample;
import Utils.DataBase;
import Model.User;

/**
 * Created by batur on 2017/7/3.
 */
public class Play {
    public static User getFun(){
        User user = new User();
        try {
           user = User.Get("a");
        }catch (Exception err){
            System.out.println("error...");
        }
        return user;
    }
}
