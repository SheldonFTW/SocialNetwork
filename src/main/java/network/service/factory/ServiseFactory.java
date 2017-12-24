package network.service.factory;

import network.service.UserService;
import network.service.impl.UserServiceImpl;

public class ServiseFactory {

    public static UserService getUserService() {
        return new UserServiceImpl();
    }
}
