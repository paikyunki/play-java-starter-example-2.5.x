package models;

import java.util.HashSet;

public class Book {

    public Integer id;
    public String title;
    public Integer price;
    public String author;

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
