package com.clemilson.bookstoremanager.mapper;

import com.clemilson.bookstoremanager.dto.BookDTO;
import com.clemilson.bookstoremanager.entity.Book;

public interface BookMapper {

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
