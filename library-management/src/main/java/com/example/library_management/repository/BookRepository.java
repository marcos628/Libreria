package com.example.library_management.repository;
import com.example.library_management.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BookRepository extends MongoRepository<Book, String> {
}
