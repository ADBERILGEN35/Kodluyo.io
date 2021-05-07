package business.abstracts;

import entities.concretes.User;

public interface UserActivationService {
    public void add(User user);
    public void check(String activationCode);
}
