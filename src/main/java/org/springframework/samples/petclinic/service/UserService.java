package org.springframework.samples.petclinic.service;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.User;

import java.util.Collection;

public interface UserService {

    void saveUser(User user) ;
    User findUserByUsername(String username) throws DataAccessException;
    void deleteUser(User user);

    Collection<User> findAllUsers();
}
