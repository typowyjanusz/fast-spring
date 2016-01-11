package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.google.common.base.Objects;

/**
 * Created by Janusz on 2016-01-08.
 */
@Entity(name = "content")
public class Content {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue
    private Integer id;

    @NotNull
    @Size(max = 64)
    @Column(name = "contents", nullable = false)
    private String contents;

    private Content() {
    }

    public Content(final Integer id, final String contents) {
        this.id = id;
        this.contents = contents;
    }

    public Integer getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("contents", contents)
                .toString();
    }
}