package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.google.common.base.Objects;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Janusz on 2016-01-08.
 */
@Entity
public class Users {

    @Id
    @NotNull
    @Size(max = 64)
    @Column(name = "username", nullable = false,
            updatable = false, unique = true)
    private String username;

    @NotNull
    @Size(max = 64)
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull
    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    private Set<UserRole> userRole = new HashSet<UserRole>(0);

    private Users() {
    }

    public Users(final String username, final String password, final boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public Users(final String username, final String password, final boolean enabled,
                 Set<UserRole> userRole) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.userRole = userRole;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserRole> getUserRole() {
        return this.userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }




    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("username", username)
                .add("password", password)
                .toString();
    }
}