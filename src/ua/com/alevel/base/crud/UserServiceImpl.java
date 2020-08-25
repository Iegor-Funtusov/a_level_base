package ua.com.alevel.base.crud;

import java.util.List;

/**
 * @author Iehor Funtusov, created 20/08/2020 - 8:36 PM
 */

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    public void create(User user) {
        int size = userDao.findAll().size();
        user.setId(++size);
        userDao.create(user);
    }

    @Override
    public void update(User user) {
        if (user.getId() <= 0) {
            throw new RuntimeException("id is incorrect");
        }
        userDao.update(user);
    }

    @Override
    public void delete(int id) {
        if (id <= 0) {
            throw new RuntimeException("id is incorrect");
        }
        userDao.delete(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
