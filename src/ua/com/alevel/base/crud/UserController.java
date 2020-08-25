package ua.com.alevel.base.crud;

import java.util.List;

/**
 * @author Iehor Funtusov, created 20/08/2020 - 8:52 PM
 */

public class UserController {
    
    private final UserService userService = new UserServiceImpl();

    public void create(User user) {
        userService.create(user);
    }

    public void update(User user) {
        userService.update(user);
    }

    public void delete(int id) {
        userService.delete(id);
    }

    public List<User> findAll() {
        return userService.findAll();
    }

    public List<User> findByName(String name) {
        return userService.findByName(name);
    }

    
    public User findById(int id) {
        return userService.findById(id);
    }
}
