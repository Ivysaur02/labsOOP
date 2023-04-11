import java.util.Arrays;

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

    public int countCharsInElements() {
        int count = 0;
        for (String actor : actors) {
            count += actor.length();
        }
        count += title.length();
        return count;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actors=" + Arrays.toString(actors) +
                ", title='" + title + " " +
        ", year=" + year +
                '}';
    }
}
