package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter injection
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(String bookName) {
        System.out.println("Library Name: " + libraryName);
        bookRepository.saveBook(bookName);
    }
}
