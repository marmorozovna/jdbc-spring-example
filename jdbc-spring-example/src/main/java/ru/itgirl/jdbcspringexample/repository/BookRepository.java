package ru.itgirl.jdbcspringexample.repository;

import ru.itgirl.jdbcspringexample.model.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book getBookById(Long id);
}
