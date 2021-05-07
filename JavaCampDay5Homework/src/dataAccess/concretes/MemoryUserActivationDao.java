package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dataAccess.abstracts.UserActivationDao;
import entities.concretes.UserActivation;

public class MemoryUserActivationDao implements UserActivationDao{

    private List<UserActivation> userActivationArrayList;

    public MemoryUserActivationDao() {
        this.userActivationArrayList = new ArrayList<UserActivation>();
    }

    @Override
    public void add(UserActivation userActivation) {
        this.userActivationArrayList.add(userActivation);
    }

    @Override
    public void update(UserActivation userActivation) {
        this.userActivationArrayList.set(
                this.userActivationArrayList.indexOf(userActivation),
                userActivation
        );
    }

    @Override
    public void delete(UserActivation userActivation) {
        this.userActivationArrayList.remove(
                this.userActivationArrayList.indexOf(userActivation)
        );
    }

    @Override
    public UserActivation get(Predicate<UserActivation> predicate) {
        return this.userActivationArrayList.stream().filter(predicate).findFirst().orElse(null);
    }

    @Override
    public List<UserActivation> getAll() {
        return this.userActivationArrayList.stream().collect(Collectors.toList());
    }

    @Override
    public List<UserActivation> getAll(Predicate<UserActivation> predicate) {
        return this.userActivationArrayList.stream().filter(predicate).collect(Collectors.toList());
    }

}
