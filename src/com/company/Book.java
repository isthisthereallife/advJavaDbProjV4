package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {
    private String title;
    private String year;
    private String id;
    private List<Author> authors = new ArrayList<>();


    Book(String title, String year, Author author) {
        this.title = title;
        this.year = year;
        this.id = String.valueOf((int) (Math.random() * 1000000));
        this.authors.add(author);

    }

    String getTitle() {
        return this.title;
    }

    String getId() {
        return this.id;
    }

    void addAuthor(Author author) {
        this.authors.add(author);
    }

    public String toString() {
        String x = "";
        for (Author a : authors) {
            x = x.concat(a.getFirstName() + " " + a.getLastName());
        }

        return "Title: " + title + " Author(s): " + x;
    }
}
