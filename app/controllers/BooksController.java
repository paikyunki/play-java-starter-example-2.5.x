package controllers;

import models.Book;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.HashSet;

import views.html.books.*;
import views.html.books.index;

public class BooksController extends Controller {

    public Result index() {
        HashSet<Book> books = Book.allBooks();
        return ok(index.render(books));
    }


    public Result save() {

        return TODO;
    }


    public Result edit(Integer id) {

        return TODO;
    }

    public Result update() {

        return TODO;
    }

    public Result destroy(Integer id) {

        return TODO;
    }

    public Result show(Integer id) {

        return TODO;
    }

}
