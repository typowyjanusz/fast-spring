package model;

import javax.persistence.*;

/**
 * Created by Janusz on 2016-01-04.
 */
@Entity
public class Task {

        @GeneratedValue
        @Id
        private long id;

        @Column
        private String name;

        @Column
        @Lob
        private String description;

        @Column
        private Double budget;

        @Column
        private Boolean done;

        //Gettery, Settery itp.
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Double getBudget() {
            return budget;
        }

        public void setBudget(Double budget) {
            this.budget = budget;
        }

        public Boolean getDone() {
            return done;
        }

        public void setDone(Boolean done) {
            this.done = done;
        }

        public Task withId(final Long id) {
            this.id = id;
            return this;
        }

        public Task withName(final String name) {
            this.name = name;
            return this;
        }

        public Task withDescription(final String description) {
            this.description = description;
            return this;
        }

        public Task withBudget(final Double budget) {
            this.budget = budget;
            return this;
        }

        public Task withDone(final Boolean done) {
            this.done = done;
            return this;
        }

        @Override
        public String toString() {
            return "<br>TaskEntity " +
                    "<h3>id=</h3>" + id +
                    "<br>Name=" + name + '\'' +
                    "<br>" + description + '\'' +
                    "<br>budget=" + budget +
                    "<br>done=" + done;
        }
    }


