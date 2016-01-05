package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Janusz on 2016-01-03.
 */

@Entity
public class Users {

    @GeneratedValue
    @Id
    private Long id;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @Column
    @NotNull
    @Size(min = 2)
    private String name;

    @Column
    private String password;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = name;
    }

    public Users withId(final Long id){
        this.id = id;
        return this;
    }

    public Users withName(final String name){
        this.name = name;
        return this;
    }

    public Users withPassword(final String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString(){

        return "Person: " + id + " " + name + " " + password;

    }

}


