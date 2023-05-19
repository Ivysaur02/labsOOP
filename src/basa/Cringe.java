package basa;


import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;

public class Cringe { //я не понимаю зачем это нужно это фул хрень
    public static  <T extends MediaItem> UnmodifiableBookDecorator<T> unmodifiable(T obj) {
        return new UnmodifiableBookDecorator<T>(obj);
    }
    public static class UnmodifiableBookDecorator<T extends MediaItem> implements MediaItem {
        private final T obj;

        public UnmodifiableBookDecorator(T obj){
            this.obj = obj;
        }

        @Override
        public int countCharsInElements() {
             return  this.obj.countCharsInElements();
        }

        @Override
        public void output(OutputStream out) throws IOException {
            obj.output(out);
        }

        @Override
        public void write(Writer out) throws IOException {
            obj.write(out);
        }

        @Override
        public Iterator<String> iterator() {
            return obj.iterator();
        }
    }
}
