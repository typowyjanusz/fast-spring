package service;


import model.Users;
import org.slf4j.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import repo.UserRepository;
import service.exception.UserAlreadyExistsException;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by Janusz on 2016-01-08.
 */
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public Users findByUserName(String username) {

        List<Users> users = new ArrayList<Users>();

        users = sessionFactory.getCurrentSession()
                .createQuery("from Users where username=?")
                .setParameter(0, username)
                .list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }

    }

}