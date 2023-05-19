package laba2;

import basa.MediaItem;

import java.io.*;

public class IOTools {
    public static <MediaItem> void output(MediaItem obj, OutputStream out) throws IOException {
        ObjectOutputStream ous = new ObjectOutputStream(out);
        ous.writeObject(obj);
    }
    public static <MediaItem> MediaItem input(InputStream inp) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(inp);
        return (MediaItem) ois.readObject();
    }

    public static <T extends MediaItem> void output(T obj, OutputStream out) throws IOException{
        ObjectOutputStream ous = new ObjectOutputStream(out);
        ous.writeObject(obj);
    }

    public static <T extends MediaItem> T input1(InputStream inp) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(inp);
        return (T) ois.readObject();
    }

}
