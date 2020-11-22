package com.clemilson.bookstoremanager.service;

import com.clemilson.bookstoremanager.dto.MessageResponseDTO;
import com.clemilson.bookstoremanager.entity.Book;
import com.clemilson.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().massage("Book created with ID " + savedBook.getId()).build();
    }
}
