package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Janusz on 2015-12-13.
 */

@Entity
public class Beer {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private double abv;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAbv(){
        return abv;
    }

    public void setAbv(double abv){
        this.abv = abv;
    }

    public Beer withId(final Long id){
        this.id = id;
        return this;
    }

    public Beer withName(final String name){
        this.name = name;
        return this;
    }

    public Beer withAbv(final double abv){
        this.abv = abv;
        return this;
    }

    @Override
    public String toString(){

        return "Piwo " + id + " " + name + " " + abv;

    }

}
