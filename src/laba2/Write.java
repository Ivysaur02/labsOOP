package laba2;

import basa.Book;
import basa.MediaItem;
import basa.Movie;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Write {
    public static void writeItem() throws IOException {
        ArrayList<MediaItem> mediaItems = new ArrayList<>();
        FileOutputStream fos = new FileOutputStream("item.bin");
        String[] bookAuthors1 = {"Антуан де Сент-Экзюпери"};
        Book book1 = new Book(bookAuthors1, "Маленький принц", 1943);
        String[] movieActors1 = {"Мэттью МакКонахи", "Аннатуар Гудман"};
        Movie movie1 = new Movie(movieActors1, "Интерстеллар", 2014);

        String[] movieActors2 = {"Том Хэнкс", "Хелен Хант"};
        Movie movie2 = new Movie(movieActors2, "Форрест Гамп", 1994);
        mediaItems.add(book1);
        mediaItems.add(movie1);
        //laba2.IOTools.output(mediaItems,fos);
        IOTools.output(movie2, fos);
    }
}
