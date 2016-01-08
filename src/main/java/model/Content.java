package model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Date;

/**
 * Created by Janusz on 2016-01-07.
 */

@Entity
@Table(name = "content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idc;

    public Integer getIdc() {
        return this.idc;
    }

    public void setIdc(Integer idc) {
        this.idc = idc;
    }

    @Column(name = "object")
    @NotEmpty
    private String object;

    @Column(name = "subject")
    @NotEmpty
    private String subject;


    public String getObject() {
        return this.object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Content withObject(final String object) {
        this.object = object;
        return this;
    }

    public Content withSubject(final String subject) {
        this.subject = subject;
        return this;
    }

    public Content withIdc(final Integer idc) {
        this.idc = idc;
        return this;
    }


    @Override
    public String toString() {
        return idc + object + subject;
    }
}
