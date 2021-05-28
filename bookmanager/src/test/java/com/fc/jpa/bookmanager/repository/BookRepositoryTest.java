package com.fc.jpa.bookmanager.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.fc.jpa.bookmanager.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void bookTest() {
        Book book = new Book();
        book.setName("Jpa 초격차 패키지");
        book.setPublisherId(1L);
        book.setAuthorId(1L);

        bookRepository.save(book);

        System.out.println(bookRepository.findAll());

    }
}