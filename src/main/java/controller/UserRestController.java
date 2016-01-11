package controller;

/**
 * Created by Janusz on 2016-01-08.
 */
import model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import service.exception.UserAlreadyExistsException;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserRestController {
/*
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRestController.class);
    private final UserService userService;

    @Inject
    public UserRestController(final UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Users createUser(@RequestBody @Valid final Users users) {
        LOGGER.debug("Received request to create the {}", users);
        return userService.save(users);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<Users> listUsers() {
        LOGGER.debug("Received request to list all users");
        return userService.getList();
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleUserAlreadyExistsException(UserAlreadyExistsException e) {
        return e.getMessage();
    }
*/
}