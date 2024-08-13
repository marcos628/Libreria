package com.example.library_management.service;

import com.example.library_management.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testGetAllBooks() {
        MockitoAnnotations.initMocks(this);
        when(bookRepository.findAll()).thenReturn(Collections.emptyList());

        assertEquals(0, bookService.getAllBooks().size());
    }
}
