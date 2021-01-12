package com.karollo593.demoProject.model.users;

import java.io.Serializable;

public abstract class AbstractUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private ROLE role;

    public AbstractUser(long id, ROLE role) {
        this.id = id;
        this.role = role;
    }

    public AbstractUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }
}
