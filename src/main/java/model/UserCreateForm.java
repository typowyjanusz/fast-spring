package model;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;


/**
 * Created by Janusz on 2016-01-08.
 */
public class UserCreateForm {

    @NotEmpty
    @Size(max = 64)
    private String username;
    @NotEmpty
    @Size(max = 64)
    private String password1;
    private String password2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("username", username)
                .add("password1", password1)
                .add("password2", password2)
                .toString();
    }

}
