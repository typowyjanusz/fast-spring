package service;

import model.Users;

import java.util.List;

/**
 * Created by Janusz on 2016-01-08.
 */
public interface UserService {

    Users findByUserName(String username);

}
