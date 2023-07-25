package booksbackend.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private String publicId;
    private User user;

    // Constructors, getters, and other methods

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Setter for imageUrl
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Setter for publicId
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    // Setter for user
    public void setUser(User user) {
        this.user = user;
    }
}
