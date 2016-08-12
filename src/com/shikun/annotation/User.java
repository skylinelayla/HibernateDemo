package com.shikun.annotation;

/**
 * Created by SHIKUN on 2016/8/12.
 */
@Table("User")
public class User {

    @Column("name")
    private String name;
    @Column("email")
    private String email;
    @Column("id")
    private int id;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

}
