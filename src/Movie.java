import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class Movie implements MediaItem {
    private String[] actors;
    private String title;
    private int year;


    public Movie() {
        this.actors = new String[0];
        this.title = "";
        this.year = 0;
    }

    public Movie(String[] actors, String title, int year) {
        this.actors = actors;
        this.title = title;
        this.year = year;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getElements() {
        return actors;
    }

    public String getElement(int index) {
        return actors[index];
    }

    public void setElement(int index, String value) {
        actors[index] = value;
    }
    @Override
    public int countCharsInElements() {
        int count = 0;
        for (String actor : actors) {
            count += actor.length();
        }
        count += title.length();
        return count;
    }

    @Override
    public void output(OutputStream out) throws IOException {
        out.write(this.toString().getBytes());
    }

    @Override
    public void write(Writer out) throws IOException {
        out.write(this.toString());
    }

    @Override
    public String toString() {
        return "Фильм " + "Актёры " + Arrays.toString(actors) +" "+ title + " год " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Movie movie = (Movie) obj;
        return year == movie.year &&
                Arrays.equals(actors, movie.actors) &&
                Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, year);
        result = 31 * result + Arrays.hashCode(actors);
        return result;
    }
}
