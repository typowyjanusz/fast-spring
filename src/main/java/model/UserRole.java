package model;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by Janusz on 2016-01-10.
 */
@Entity
@Table(name = "user_roles",
        uniqueConstraints = @UniqueConstraint(
                columnNames = { "role", "username" }))
public class UserRole{

    private Integer userRoleId;
    private Users users;
    private String role;

    public UserRole() {
    }

    public UserRole(Users users, String role) {
        this.users = users;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_role_id",
            unique = true, nullable = false)
    public Integer getUserRoleId() {
        return this.userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    public Users getUser() {
        return this.users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    @Column(name = "role", nullable = false, length = 45)
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}