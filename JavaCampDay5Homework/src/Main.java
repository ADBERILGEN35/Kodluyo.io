import business.abstracts.AuthService;
import business.abstracts.UserActivationService;
import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import business.concretes.AuthManager;
import business.concretes.UserActivationManager;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import business.concretes.UserValidationManager;
import core.utils.mail.CustomMailManager;
import core.utils.mail.MailService;
import core.utils.signUp.googleSignUp.GoogleSignUpManagerAdapter;
import dataAccess.abstracts.UserActivationDao;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.MemoryUserActivationDao;
import dataAccess.concretes.MemoryUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserDao userDao = new MemoryUserDao();
        UserValidationService userValidationService = new UserValidationManager();
        UserCheckService userCheckService = new UserCheckManager(userDao);

        UserActivationDao userActivationDao = new MemoryUserActivationDao();
        MailService mailService = new CustomMailManager();
        UserActivationService userActivationService = new UserActivationManager(userDao, userActivationDao, mailService);

        UserService userService = new UserManager(userDao, userValidationService, userCheckService, userActivationService);

        User user = new User
                (1,
                        "Oğuzhan",
                        "Taşyaran",
                        "oguzhantasyaram@outlook.com.",
                        "123456"
                );

        AuthService authService = new AuthManager(userDao, new GoogleSignUpManagerAdapter(userService));
        authService.register(user);

        userActivationService.check("2e315ebc-a2e1-48db-b250-cf560a845e22");

        authService.login("oguzhantasyaram@outlook.com", "123456");

    }

}
