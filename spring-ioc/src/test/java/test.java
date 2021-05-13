import com.zht.dao.UserDaoImpl;
import com.zht.dao.UserOracleDaoImpl;
import com.zht.service.UserService;

public class test {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
