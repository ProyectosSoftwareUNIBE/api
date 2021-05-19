package unibe.edu.ec.api.dtos;

import unibe.edu.ec.api.documents.User;

public class UserDto {

    private String id,name,lastName,role;

    public UserDto() {
    }

    public UserDto(User user){
        this.name=user.getName();
        this.lastName=user.getLasName();
        this.role=user.getRole();
    }

    public UserDto(String id, String name, String lastName, String role) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
