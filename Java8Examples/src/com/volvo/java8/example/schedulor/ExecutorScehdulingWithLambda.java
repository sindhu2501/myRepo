package com.volvo.java8.example.schedulor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class ExecutorScehdulingWithLambda {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book(1L, "Java"), new Book(2L, "C++"));
        ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable r1 = () -> books.forEach(Book::getBookName);
        service.execute(r1);

        Runnable r2 = () -> {
            Consumer<Book> newBook = (Book b) -> System.out.println(b.getId() + "," + b.getBookName());
            books.forEach(newBook);
        };
        service.execute(r2);
        service.shutdown();
    }
}

class Book {
    private Long id;
    private String bookName;

    public Book(Long id, String bookName) {
        super();
        this.id = id;
        this.bookName = bookName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}