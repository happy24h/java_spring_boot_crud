package com.example.demospringboot.controller;

import com.example.demospringboot.model.Book;
import com.example.demospringboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/list-books")
    public List<Book>getAllBook(){
        return bookRepository.findAll();
    }
    @PostMapping("/create-book")
    public Book addBooks(@RequestBody Book book){
        return  bookRepository.save(book);
    }
    @PutMapping("/update-book")
    public Book updateBook(@RequestBody Book book){
     return bookRepository.save(book);
    }
    @DeleteMapping("/delete-book/{id}")
    public Book deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
        return  null;
    }
}
