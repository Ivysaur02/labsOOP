package basa;

import java.io.*;

public interface MediaItem extends Serializable, Iterable<String> {

    int countCharsInElements();
    void output(OutputStream out) throws IOException;
    void write(Writer out) throws IOException;

    void setTitle(String str);
    String getTitle();

    //void read(Reader in) throws IOException;
}
