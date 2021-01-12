package com.karollo593.demoProject.model.users;

enum ROLE {
    Admin("Administrator"),
    Employee("Employee"),
    Client("Client");

    private String role;

    ROLE(String role) {
        this.role = role;
    }
}
