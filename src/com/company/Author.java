package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Author implements Serializable {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String authorID;
    private List<Book> bibliography = new ArrayList<>();


    Author(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.authorID = String.valueOf((int) (Math.random() * 1000000));
        this.bibliography = new ArrayList<>();
    }

    public Author(Object read) {
    }

    public void addBookToAuthor(Book book) {
        this.bibliography.add(book);
    }

    public String getAuthorID() {
        return authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        String x = "Author name: " + firstName + " " + lastName;
        for (Book b : this.bibliography) {
            x = x.concat(" Book: " + b.getTitle() + " ");
        }
        return x;
    }
}
