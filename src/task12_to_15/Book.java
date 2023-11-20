package task12_to_15;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price, int edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
    }

    public Book(String title, String author, int price, int edition, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", price: " + price + ", edition: " + edition;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return this.price == other.price && this.title.equals(other.title) && this.author.equals(other.author);
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 89 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 89 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 89 * hash + this.price;
        return hash;
    }

    @Override
    public Book clone() {
        Book foo = null;
        try {
            foo = (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error while cloning programmer");
        }
        return foo;
    }

    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }
}
