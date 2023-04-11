import java.util.Arrays;
import java.util.Objects;

public class Book implements MediaItem {
    private String[] authors;
    private String title;
    private int year;

    public Book() {
        this.authors = new String[0];
        this.title = "";
        this.year = 0;
    }

    public Book(String[] authors, String title, int year) {
        this.authors = authors;
        this.title = title;
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
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
        return authors;
    }

    public String getElement(int index) {
        return authors[index];
    }

    public void setElement(int index, String value) {
        authors[index] = value;
    }

    public int countCharsInElements() {
        int count = 0;
        for (String author : authors) {
            count += author.length();
        }
        count += title.length();
        return count;
    }

    @Override
    public String toString() {
        return "Книга" + " Автор(ы) " + Arrays.toString(authors)+ " " + title + " год " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return year == book.year &&
                Arrays.equals(authors, book.authors) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, year);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

}