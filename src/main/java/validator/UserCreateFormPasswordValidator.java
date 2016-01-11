package validator;

import model.UserCreateForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Janusz on 2016-01-08.
 */
@Component
public class UserCreateFormPasswordValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz){
        return UserCreateForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors){
        /*
        UserCreateForm form = (UserCreateForm) target;
        if (!form.getContents1().equals(form.getPassword2())){
            errors.rejectValue("password2","user.error.password.no_match");
        }
        */
    }

}
