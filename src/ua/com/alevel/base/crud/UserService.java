package ua.com.alevel.base.crud;

import java.util.List;

/**
 * @author Iehor Funtusov, created 20/08/2020 - 8:35 PM
 */

public interface UserService {

    void create(User user);
    void update(User user);
    void delete(int id);
    List<User> findAll();
    List<User> findByName(String name);
    User findById(int id);
}
