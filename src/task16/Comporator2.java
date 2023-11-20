package task16;

import task12_to_15.Book;

import java.util.Comparator;

//author then title
public class Comporator2 implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int authorCompare = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorCompare != 0) {
            return authorCompare;
        } else {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }
}

