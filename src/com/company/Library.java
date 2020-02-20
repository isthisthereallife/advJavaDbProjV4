package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Library extends Db implements databaseEntity {
    public List<Author> authors = new ArrayList<>();
    public List<Book> books = new ArrayList<>();

    Library() {
        //makeAnAuthorWithABook();

        //Menu.getInstance();
        makeAnAuthorWithABook();
    }

    void makeAnAuthorWithABook() {
/*

        Author a = new Author("Agatha", "Aan", "1849-03-02");
        Author c = new Author("Caesar", "Colaa", "1849-03-02");
        Author e = new Author("Eugene", "Eiro", "1849-03-02");
        Serializer.write(Paths.get(currentPath + "/" + a.getAuthorID()), a);
        Serializer.write(Paths.get(currentPath + "/" + c.getAuthorID()), c);
        Serializer.write(Paths.get(currentPath + "/" + e.getAuthorID()), e);
        //sparar till disk
        Serializer.write(Paths.get(currentPath + "/" + a.getAuthorID()), a);

        */
        ArrayList<Object> objectArrayList = Db.makeArrayListFromPath(Paths.get("database/authors/"));

        for(Object object :objectArrayList){
            System.out.println(object.getClass().getName());
            if (object instanceof Author) {
                authors.add((Author)object);
            } else if (object instanceof Book) {
                books.add((Book) object);
            }
        }

        objectArrayList = Db.makeArrayListFromPath(Paths.get("database/books/"));
        for(Object object : objectArrayList) {
            if (object instanceof Author) {
                authors.add((Author) object);
            } else if (object instanceof Book) {
                books.add((Book) object);
            }
        }
        System.out.println();
        /*
        Book b = new Book("Booky", "1865", a);
        Book d = new Book("Desert", "1865", c);
        Book f = new Book("Frrroop", "1865", e);
        Serializer.write(Paths.get(currentPath + "/" + b.getId()), b);
        Serializer.write(Paths.get(currentPath + "/" + d.getId()), d);
        Serializer.write(Paths.get(currentPath + "/" + f.getId()), f);
        a.addBookToAuthor(b);
        c.addBookToAuthor(d);
        e.addBookToAuthor(f);
        //gör lista från disk
        Db.makeListFromPath(currentPath);

         */
    }

}
