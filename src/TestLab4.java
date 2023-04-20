import java.util.ArrayList;
import java.util.List;

public class TestLab4 {
    public static void go(){
        ArrayList<MediaItem> mediaItems = new ArrayList<>();
        String[] bookAuthors1 = {"Антуан де Сент-Экзюпери"};
        Book book1 = new Book(bookAuthors1, "Маленький принц", 1943);

        String[] bookAuthors2 = {"Эрнест Хемингуэй"};
        Book book2 = new Book(bookAuthors2, "Старик и море", 1952);

        String[] movieActors1 = {"Мэттью МакКонахи", "Аннатуар Гудман"};
        Movie movie1 = new Movie(movieActors1, "Интерстеллар", 2014);

        String[] movieActors2 = {"Том Хэнкс", "Хелен Хант"};
        Movie movie2 = new Movie(movieActors2, "Форрест Гамп", 1994);

        mediaItems.add(book1);
        mediaItems.add(book2);
        mediaItems.add(movie1);
        mediaItems.add(movie2);

        // Выводим полную информацию обо всех объектах массива
        for (MediaItem item : mediaItems) {
            System.out.println(item);
        }

        // Находим объекты с одинаковым результатом функционального метода
        List<MediaItem> equalItems = new ArrayList<>();
        for (int i = 0; i < mediaItems.size(); i++) {
            for (int j = i + 1; j < mediaItems.size(); j++) {
                if (mediaItems.get(i).countCharsInElements() == mediaItems.get(j).countCharsInElements()) {
                    equalItems.add(mediaItems.get(i));
                    equalItems.add(mediaItems.get(j));
                }
            }
        }
        if (!equalItems.isEmpty()) {
            System.out.println("Повторяются:");
            for (MediaItem item : equalItems)
                System.out.println(item);
        }
        // в данном примере нет похожих но написать вы можете

        // Разбиваем исходный массив на два массива с однотипными элементами
        List<Book> books = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();
        for (MediaItem item : mediaItems) {
            if (item instanceof Book) {
                books.add((Book) item);
            } else if (item instanceof Movie) {
                movies.add((Movie) item);
            }
        }
        // Вывод книг
        System.out.println("Книги:");
        for (Book book : books) {
            System.out.println(book);
        }

// Вывод фильмов
        System.out.println("Фильмы:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}