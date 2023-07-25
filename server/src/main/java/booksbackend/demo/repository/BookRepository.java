package booksbackend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import booksbackend.demo.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
