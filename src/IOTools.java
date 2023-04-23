import java.io.*;

public class IOTools {
    public static <MediaItem> void output(MediaItem obj, OutputStream out) throws IOException {
        ObjectOutputStream ous = new ObjectOutputStream(out);
        ous.writeObject(obj);
        ous.close();
    }
    public static <MediaItem> MediaItem input(InputStream inp) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(inp);
        return (MediaItem) ois.readObject();
    }
}
