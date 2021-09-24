package com.demo.liquibase.persistence;

import com.demo.liquibase.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}