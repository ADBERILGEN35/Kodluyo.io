package business.abstracts;

import entities.concretes.User;

public interface AuthService {
    public void login(String email, String password);
    public void register(User user);
}
