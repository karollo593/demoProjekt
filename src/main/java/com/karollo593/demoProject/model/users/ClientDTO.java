package com.karollo593.demoProject.model.users;

public class ClientDTO {
    private long id;
    private ROLE role;
    private String firstName;
    private String lastName;
    private ClientDetails details;

    public ClientDTO(long id, ROLE role, String firstName, String lastName, ClientDetails details) {
        this.id = id;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.details = details;
    }

    public ClientDTO() {
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
