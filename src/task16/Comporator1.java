package task16;

import task12_to_15.Book;

import java.util.Comparator;

//title then author
public class Comporator1 implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int titleCompare = book1.getTitle().compareTo(book2.getTitle());
        if (titleCompare != 0) {
            return titleCompare;
        } else {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    }
}
