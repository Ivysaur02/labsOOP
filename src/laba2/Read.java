package laba2;

import basa.MediaItem;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Read {
    public static void readItem() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("item.bin");
        ArrayList<MediaItem> mediaItems = new ArrayList<>();
        mediaItems = IOTools.input(fis);
        System.out.println(mediaItems.toString());
    }
}
