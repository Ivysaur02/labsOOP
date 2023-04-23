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
        mediaItems.add(book1);
        mediaItems.add(movie1);
        IOTools.output(mediaItems, fos);
    }
}
