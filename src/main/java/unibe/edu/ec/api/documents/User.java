package unibe.edu.ec.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class User {

    @Id
    private String id;

    private String name, lasName,role;

    public User() {
    }

    public User(String id, String name, String lasName, String role) {
        this.id = id;
        this.name = name;
        this.lasName = lasName;
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

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true;
       if( obj ==null || getClass() != obj.getClass()) return false;
       User user=(User) obj;
       return Objects.equals(name, user.name)
               && Objects.equals(lasName, user.lasName)
               && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lasName,role);
    }
}
