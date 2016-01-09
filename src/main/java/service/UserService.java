package service;

import model.User;

import java.util.List;

/**
 * Created by Janusz on 2016-01-08.
 */
public interface UserService {

    User save(User user);

    List<User> getList();

}
