package web.DAO;


import web.model.User;

import javax.persistence.Query;
import java.util.List;

public class UserDAOHibernateImpl implements UserDAO {


    @Override
    public void saveUser(String name, int age, String email) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void removeById(long id) {

    }

    @Override
    public void updateUser(String name, int age, String email) {

    }
}
