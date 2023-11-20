package task16;

import task12_to_15.Book;

import java.util.Comparator;

//author title and price
public class Comporator3 implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int authorCompare = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorCompare != 0) {
            return authorCompare;
        } else {
            int titleCompare = book1.getTitle().compareTo(book2.getTitle());
            if (titleCompare != 0) {
                return titleCompare;
            } else {
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
        }
    }
}
