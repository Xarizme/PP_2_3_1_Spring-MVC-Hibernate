package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDAO;
import web.model.User;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void saveUser(String name, int age, String email) {
        userDAO.saveUser(name, age, email);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void removeById(Long id) {
        userDAO.removeById(id);
    }

    @Override
    @Transactional
    public void updateUser(Long id, String name, int age, String email) {
        userDAO.updateUser(id, name, age, email);
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }
}
