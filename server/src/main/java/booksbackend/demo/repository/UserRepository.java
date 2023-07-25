package booksbackend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import booksbackend.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
