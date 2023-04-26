package org.example.ZadaniaProgramAdvancedPDF.Exc2_BooK;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        this.bookList.add(book);
    }

    public void remove(String isbn) throws NoBookFoundException {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                bookList.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete book with isbn: " + isbn);
    }

    public Book findByIndex(String isbn) throws NoBookFoundException {
        for (Book book : bookList) {
            if (book.getIsbn().equals(book)) {
                return book;
            }
        }
        throw new NoBookFoundException("Can't find book with isbn: " + isbn);
    }

    public List<Book> findByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Can't find book with name: " + name);
        }
        return booksByName;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "bookList=" + bookList +
                '}';
    }
}
