package web.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOHibernateImpl implements UserDAO {

    private final EntityManager entityManager;

    @Autowired
    public UserDAOHibernateImpl(@Qualifier("getEntityManager") EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void saveUser(String name, int age, String email) {
        entityManager.getTransaction().begin();
        entityManager.merge(new User(name,age,email));
        entityManager.getTransaction().commit();
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void removeById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(User.class, id));
        entityManager.getTransaction().commit();
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(Long id, String name, int age, String email) {
        entityManager.getTransaction().begin();
        User user = getUserById(id);
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        entityManager.merge(user);

        entityManager.getTransaction().commit();
    }
}
