package business.abstracts;

import entities.concretes.User;

public interface UserValidationService  {
    public void validate(User user) throws Exception;
}