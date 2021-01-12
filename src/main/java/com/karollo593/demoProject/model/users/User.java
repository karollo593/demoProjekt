package com.karollo593.demoProject.model.users;

public class User extends AbstractUser {
    private String firstName;
    private String lastName;

    public User(long id, ROLE role, String firstName, String lastName) {
        super(id, role);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
