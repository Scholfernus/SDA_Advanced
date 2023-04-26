package org.example.ZadaniaProgramAdvancedPDF.Exc2_BooK;

import java.util.List;

public class Book_Main {
    public static void main(String[] args) throws NoBookFoundException{
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("3323-434ds", "Harry Potter Part 1","J.K. Rowling",2020));
        bookRepository.add(new Book("54dsd-dsds","Harry Potter Part 1","J.K. Rowling",2019));
        System.out.println(bookRepository);
        List<Book>books = bookRepository.findByName("Harry Potter Part 1");
        Book book1 = bookRepository.findByIndex("3323-434ds");
        bookRepository.remove("43");
    }
}
