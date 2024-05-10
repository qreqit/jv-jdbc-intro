package mate.academy.lib;

import java.util.List;
import java.util.Optional;
import mate.academy.model.Book;

public interface DaoBook {
    Book create(Book book);

    Optional<Book> findById(Long id);

    List<Book> findAll();

    Book update(Book book);

    boolean deleteById(Long id);
}