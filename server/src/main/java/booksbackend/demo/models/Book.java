package booksbackend.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    private String imageUrl;

    @NotNull
    private String publicId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Book(String title, String description, String imageUrl, String publicId, User user) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.publicId = publicId;
        this.user = user;
    }

    public Book() {
    }
}
