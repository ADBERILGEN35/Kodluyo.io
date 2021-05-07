package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {
    public void check(User user) throws Exception;
}

