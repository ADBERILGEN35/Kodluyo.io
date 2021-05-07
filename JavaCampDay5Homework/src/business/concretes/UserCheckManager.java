package business.concretes;

import business.abstracts.UserCheckService;
import core.utils.ServiceUtils;
import core.utils.consts.ValidationMessage;
import core.utils.result.ErrorResult;
import core.utils.result.Result;
import core.utils.result.SuccessResult;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService {

    private UserDao userDao;

    public UserCheckManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void check(User user) throws Exception {
        Result[] results = ServiceUtils.runChecks(this.checkDuplicateEmail(user.getEmail()));

        for (Result result : results) {
            if (!result.isSuccess()) {
                throw new Exception(result.getMessage());
            }
        }
    }

    private Result checkDuplicateEmail(String email) {
        if(this.userDao.get(u -> u.getEmail() == email) != null) {
            return new ErrorResult(ValidationMessage.emailAlreadyExists);
        }

        return new SuccessResult();
    }

}
