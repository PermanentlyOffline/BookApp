package mk.ukim.finki.wp.lab.repository.impl;

import mk.ukim.finki.wp.lab.bootsrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.repository.BookRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {

    @Override
    public List<Book> findAll() {
        return DataHolder.books;
    }

    @Override
    public List<Book> searchBooks(String text, Double rating) {
        return DataHolder.books.stream()
                .filter(book -> book.getTitle().contains(text) ||
                book.getGenre().contains(text) || book.getAverageRating() >= rating)
                .toList();
    }
}
