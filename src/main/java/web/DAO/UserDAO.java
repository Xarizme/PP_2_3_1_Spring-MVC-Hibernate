package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(String name, int age, String email);
    List<User> getAllUsers();
    void removeById(Long id);
    User getUserById(Long id);
    void updateUser(Long id, String name, int age, String email);
}
