package com.company;

import java.nio.file.Path;

public class App {

    App() {
        Library lib = new Library();
        //Menu.getInstance();




        Book u = new Book("name", "292","forfattare");
        lib.save(u);

        Book other = (Book)lib.findOne("title", "name");

        System.out.println("These should have the same password: " + other.getTitle() +" and " + u.getTitle());
    }



}
