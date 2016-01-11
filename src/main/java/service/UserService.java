package service;

import model.Content;

import java.util.List;

/**
 * Created by Janusz on 2016-01-08.
 */
public interface UserService {

    Content save(Content content);

    List<Content> getList();

}
