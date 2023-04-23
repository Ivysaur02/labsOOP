import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Read {
    public static void readItem() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("item.bin");
        ArrayList<MediaItem> mediaItems = new ArrayList<>();
        mediaItems = IOTools.input(fis);
        System.out.println(mediaItems.toString());
    }
}
