package com.demo.liquibase.manager;


import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.demo.liquibase.entities.Author;
import com.demo.liquibase.persistence.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorsManager {

  private AuthorRepository authorRepository;

  @Autowired
  public AuthorsManager(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Stream<Author> getAllAuthors() {
    return StreamSupport.stream(authorRepository.findAll().spliterator(), true);
  }
}