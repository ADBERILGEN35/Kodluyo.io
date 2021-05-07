package core.utils.signUp.googleSignUp;

import business.abstracts.BaseSignUpManager;
import business.abstracts.UserService;
import core.utils.consts.ValidationMessage;
import entities.concretes.User;
import GoogleAuthentication.GoogleAuthenticationManager;

public class GoogleSignUpManagerAdapter extends BaseSignUpManager {

    public GoogleSignUpManagerAdapter(UserService userService) {
        super(userService);
    }

    @Override
    public void register(User user) {
        GoogleAuthenticationManager googleSignUpManager = new GoogleAuthenticationManager();
        boolean result = googleSignUpManager.login(user.getEmail());
        if(result) {
            super.register(user);
            System.out.println(ValidationMessage.googleSignUpSuccessful);
        }else {
            System.out.println(ValidationMessage.googleSignUpFailed);
        }
    }

}
