package com.demo.liquibase.persistence;

import com.demo.liquibase.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}