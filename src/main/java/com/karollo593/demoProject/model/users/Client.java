package com.karollo593.demoProject.model.users;

public class Client extends AbstractUser {
    private String firstName;
    private String lastName;

    private ClientDetails details;

    public Client(long id, String firstName, String lastName, ClientDetails details) {
        super(id, ROLE.Client);
        this.firstName = firstName;
        this.lastName = lastName;
        this.details = details;
    }

    public Client() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ClientDetails getDetails() {
        return details;
    }

    public void setDetails(ClientDetails details) {
        this.details = details;
    }
}
