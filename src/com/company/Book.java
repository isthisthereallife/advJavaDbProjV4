package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {
    private String title;
    private String year;
    private String id;
    private String authors;


    Book(String title, String year, String author) {
        this.title = title;
        this.year = year;
        this.id = String.valueOf((int) (Math.random() * 1000000));
        this.authors = author;

    }

    String getTitle() {
        return this.title;
    }

    String getId() {
        return this.id;
    }

    public String toString() {


        return "Title: " + title + " Author(s): " + authors;
    }
}
