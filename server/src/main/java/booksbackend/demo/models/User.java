package booksbackend.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    private String email;

    private String password;

    @NotNull
    private String imageUrl;

    @NotNull
    private String publicId;

    public User(String name, String surname, String email, String password, String imageUrl, String publicId) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.imageUrl = imageUrl;
        this.publicId = publicId;
    }

    public User() {
    }
}
