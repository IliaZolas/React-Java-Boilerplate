package booksbackend.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String imageUrl;
    private String publicId;

    // Constructors, setters, and other methods

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for surname
    public String getSurname() {
        return surname;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Getter for imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    // Getter for publicId
    public String getPublicId() {
        return publicId;
    }
}
