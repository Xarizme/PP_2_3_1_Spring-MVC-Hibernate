package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(String name, int age, String email);
    List<User> getAllUsers();
    void removeById(long id);
    void updateUser(String name, int age, String email);
}
