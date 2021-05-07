package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import entities.concretes.User;

public class MemoryUserDao implements UserDao {

    private List<User> userArrayList;

    public MemoryUserDao() {
        this.userArrayList = new ArrayList<User>();
    }

    @Override
    public void add(User user) {
        this.userArrayList.add(user);
    }

    @Override
    public void update(User user) {
        this.userArrayList.set(
                this.userArrayList.indexOf(user),
                user
        );
    }

    @Override
    public void delete(User user) {
        this.userArrayList.remove(
                this.userArrayList.indexOf(user)
        );
    }

    @Override
    public User get(Predicate<User> predicate) {
        return this.userArrayList.stream().filter(predicate).findFirst().orElse(null);
    }

    @Override
    public List<User> getAll() {
        return this.userArrayList.stream().collect(Collectors.toList());
    }

    @Override
    public List<User> getAll(Predicate<User> predicate) {
        return this.userArrayList.stream().filter(predicate).collect(Collectors.toList());
    }

}