package task12_to_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void testClone() {
        Book originBook = new Book("Title1", "Author1", 30, 1);

        Book clonedBook = originBook.clone();

        Assertions.assertNotSame(originBook, clonedBook);

        assertEquals(originBook.getTitle(), clonedBook.getTitle());
        assertEquals(originBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originBook.getPrice(), clonedBook.getPrice());
        assertEquals(originBook.getEdition(), clonedBook.getEdition());
    }

    @Test
    public void testCompareTo() {
        Book book1 = new Book("Title1", "Author1", 30, 1, "1");
        Book book2 = new Book("Title1", "Author1", 30, 1, "2");
        Book book3 = new Book("Title1", "Author1", 30, 1, "3");
        Book book4 = new Book("Title1", "Author1", 30, 1, "4");

        List<Book> books = new ArrayList<>();
        books.add(book3);
        books.add(book1);
        books.add(book2);
        books.add(book4);

        Collections.sort(books);

        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
        assertEquals(book4, books.get(3));
    }
}