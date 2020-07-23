package io.github.mattshen.sbb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utilizator")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "usertype")
    private int usertype;

    @Column(name = "passwdhash")
    private String password;

    public User() {
    }

    public User(String name, String email, int usertype, String password) {
        this.name = name;
        this.email = email;
        this.usertype = usertype;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public int getUsertype() {
        return this.usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", usertype=" + usertype + "]";
    }
}
