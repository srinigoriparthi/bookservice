package com.gsrao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class Book {

    private final int id;
    private String name;
    private int price;

    public Book(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
