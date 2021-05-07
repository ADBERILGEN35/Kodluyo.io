package business.concretes;

import business.abstracts.AuthService;
import core.utils.consts.ValidationMessage;
import core.utils.signUp.SignUpService;
import core.utils.signUp.SignUpService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
public class AuthManager implements AuthService {

    private UserDao userDao;
    private SignUpService signUpService;

    public AuthManager(UserDao userDao, SignUpService signUpService) {
        this.userDao = userDao;
        this.signUpService = signUpService;
    }

    @Override
    public void login(String email, String password) {

        if(this.userDao.get(u -> u.getEmail() == email && u.getPassword() == password) != null) {
            System.out.println(ValidationMessage.userLoggedIn);
        }else {
            System.out.println(ValidationMessage.userEmailOrPasswordNotFound);
        }
    }

    @Override
    public void register(User user) {
        this.signUpService.register(user);
    }

}
