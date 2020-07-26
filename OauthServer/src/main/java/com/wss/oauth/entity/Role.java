package com.wss.oauth.entity;

import java.io.Serializable;

public class Role implements Serializable {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role() {
        super();
    }
    public Role(String name) {
        super();
        this.name = name;
    }

    // getter & setter

    @Override
    public String toString() {
        return "Role [id=" + id + ", name=" + name + "]";
    }
}