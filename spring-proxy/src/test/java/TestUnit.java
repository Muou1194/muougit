import org.junit.Test;
import service.ProxyInvocationHandler;
import service.UserService;
import service.UserServiceImpl;

import java.util.HashMap;

public class TestUnit {

    public static void main(String[] args) {

    }

    @Test
    public void test0() {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        proxy.delete();
        proxy.query();
        proxy.update();
    }




}
