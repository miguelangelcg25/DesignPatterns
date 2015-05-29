package dao;

import dao.beans.Book;
import java.util.Collection;

/**
 *
 * @author miguelangel
 */
public interface BookDao {
    
    public Book findByIsbn(String isbn);
    public Collection<Book> findAll();
    public void create(Book book);
    public void update(Book book);
    public void delete(Book book);
    
}
