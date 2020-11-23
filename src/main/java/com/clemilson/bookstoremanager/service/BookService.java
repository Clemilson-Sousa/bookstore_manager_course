package com.clemilson.bookstoremanager.service;

import com.clemilson.bookstoremanager.dto.BookDTO;
import com.clemilson.bookstoremanager.dto.MessageResponseDTO;
import com.clemilson.bookstoremanager.entity.Book;
import com.clemilson.bookstoremanager.mapper.BookMapper;
import com.clemilson.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSaved = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSaved);
        return MessageResponseDTO.builder().massage("Book created with ID " + savedBook.getId()).build();
    }
}
