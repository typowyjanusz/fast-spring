package controller;

import model.Users;
import model.UserCreateForm;
import service.UserService;
import service.exception.UserAlreadyExistsException;
import validator.UserCreateFormPasswordValidator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.validation.Valid;

/**
 * Created by Janusz on 2016-01-08.
 */
@Controller
public class UserCreateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserCreateController.class);
    private final UserService userService;
    private final UserCreateFormPasswordValidator passwordValidator;

    @Inject
    public UserCreateController(UserService userService, UserCreateFormPasswordValidator passwordValidator) {
        this.userService = userService;
        this.passwordValidator = passwordValidator;
    }

    @InitBinder("form")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(passwordValidator);
    }

    @RequestMapping(value = "/user_create.html", method = RequestMethod.GET)
    public ModelAndView getCreateUserView() {
        LOGGER.debug("Received request for user create view");
        return new ModelAndView("user_create", "form", new UserCreateForm());
    }
/*
    @RequestMapping(value = "/user_create.html", method = RequestMethod.POST)
    public String createUser(@ModelAttribute("form") @Valid UserCreateForm form, BindingResult result) {
        LOGGER.debug("Received request to create {}, with result={}", form, result);
        if (result.hasErrors()) {
            return "user_create";
        }
        try {
            userService.save(new Users(form.getUsername(), form.getPassword2());
        } catch (UserAlreadyExistsException e) {
            LOGGER.debug("Tried to create user with existing id", e);
            result.reject("user.error.exists");
            return "user_create";
        }
        return "redirect:/user_list.html";
    }
*/
}
