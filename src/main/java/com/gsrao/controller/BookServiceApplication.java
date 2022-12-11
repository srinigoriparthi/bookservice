package com.gsrao.controller;

import com.gsrao.dto.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class BookServiceApplication {

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/getAllBooks")
    public List<Book> getBooks(){

        return Stream.of(new Book(1, "Java", 1000),
                new Book(2, "Oracle", 500) ).collect(Collectors.toList());
    }

    public static void  main(String[] args){
        SpringApplication.run(BookServiceApplication.class, args);
    }
}
