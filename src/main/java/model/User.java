package model;

/**
 * Created by Janusz on 2016-01-08.
 */
public class User {
    public String uname;
    public String upass;
    public String urepass;

    public User() {
    }

    public String getUname() {
        return this.uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return this.upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUrepass() {
        return this.urepass;
    }

    public void setUrepass(String urepass) {
        this.urepass = urepass;
    }
}