package ua.com.alevel.base.crud;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iehor Funtusov, created 20/08/2020 - 8:04 PM
 */

public class UserDaoImpl implements UserDao {

    private final List<User> users = new ArrayList<>();

    @Override
    public void create(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        boolean exist = false;
        for (User currentUser : users) {
            if (currentUser.getId() == user.getId()) {
                currentUser.setAge(user.getAge());
                currentUser.setName(user.getName());
                exist = true;
            }
        }
        if (!exist) {
            throw new RuntimeException("user not found");
        }
    }

    @Override
    public void delete(int id) {
        boolean exist = false;
        for (User currentUser : users) {
            if (currentUser.getId() == id) {
                users.remove(currentUser);
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new RuntimeException("user not found");
        }
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public List<User> findByName(String name) {
        List<User> tempUsers = new ArrayList<>();
        for (User currentUser : users) {
            if (currentUser.getName().equals(name)) {
                tempUsers.add(currentUser);
            }
        }
//        return users.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
        return tempUsers;
    }

    @Override
    public User findById(int id) {
        for (User currentUser : users) {
            if (currentUser.getId() == id) {
                return currentUser;
            }
        }
        throw new RuntimeException("user not found");
    }
}
