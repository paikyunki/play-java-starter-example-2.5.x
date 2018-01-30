package models;

import java.util.HashSet;
import com.avaje.ebean.Model;

public class Book extends Model {

    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book() {}

    public Book(Integer id, String title, Integer price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    private static HashSet<Book> books;

    static {
        books = new HashSet<Book>();
        books.add(new Book(1, "C++", 20, "ABC"));
        books.add(new Book(2, "Java", 30, "XYZ"));
        books.add(new Book(3, "Play Framework", 20, "Dianne"));
        books.add(new Book(4, "Angular 4", 30, "Brinda"));
    }

    public static HashSet<Book> allBooks() {
        return books;
    }

    public static Book findById(Integer id) {
        for (Book book : books) {
            if (id.equals(book.id)) {
                return book;
            }
        }
        return null;
    }

    public static void add(Book book) {
        books.add(book);
    }

    public static boolean remove(Book book) {
        return books.remove(book);
    }
}
