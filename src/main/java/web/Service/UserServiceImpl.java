package web.Service;

import web.DAO.UserDAO;
import web.DAO.UserDAOHibernateImpl;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAOHibernateImpl();

    @Override
    public void saveUser(String name, int age, String email) {
        userDAO.saveUser(name, age, email);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void removeById(long id) {
        userDAO.removeById(id);
    }

    @Override
    public void updateUser(String name, int age, String email) {
        userDAO.updateUser(name, age, email);
    }
}
