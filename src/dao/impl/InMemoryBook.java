package dao.impl;

import dao.BookDao;
import dao.beans.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author miguelangel
 */
public class InMemoryBook implements BookDao{
    
    private final static Map<String, Book> books = new HashMap<>();

    @Override
    public Book findByIsbn(String isbn) {
        return books.get(isbn);
    }

    @Override
    public Collection<Book> findAll() {
        return books.values();
    }

    @Override
    public void create(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public void update(Book book) {
        books.replace(book.getIsbn(), book);
    }

    @Override
    public void delete(Book book) {
        books.remove(book.getIsbn());
    }
    
}
