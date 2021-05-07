package business.abstracts;

import core.utils.signUp.SignUpService;
import entities.concretes.User;

public abstract class BaseSignUpManager implements SignUpService {

    private UserService userService;

    public BaseSignUpManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void register(User user) {
        this.userService.add(user);
    }

}
