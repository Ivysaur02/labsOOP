package test;


import basa.Book;
import basa.Movie;
import com.sun.source.tree.LambdaExpressionTree;
import laba3.BookFactory;
import laba3.Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestForLab3 {

    private Book book;
    private Movie movie;

    private Book emphtyBook;

    @Before
    public void init() {
        String[] bookAuthors = {"Антуан де Сент-Экзюпери"};
        book = new Book(bookAuthors, "Маленький принц", 1943);
        String[] movieActors = {"Том Хэнкс", "Хелен Хант"};
        movie = new Movie(movieActors, "Форрест Гамп", 1994);
        emphtyBook = new Book();
    }

    @Test
    public void IteratorActorInFilm(){
        String[] expectedActors = {"Том Хэнкс", "Хелен Хант"};
        Iterator<String> iterator = movie.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedActors[i], iterator.next());
            i++;
        }
    }

    @Test
    public void IteratorAuthorsInMovie(){
        String[] expectedAuthors = {"Антуан де Сент-Экзюпери"};
        Iterator<String> iterator = book.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedAuthors[i], iterator.next());
            i++;
        }
    }

    @Test
    public void CreateEmphtyBookWithFabric(){
        Factory factory = new BookFactory();
        Book testBook = (Book) factory.create();
        assertEquals(emphtyBook, testBook);
    }

}
