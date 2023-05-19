package laba3;

import basa.Book;

public class BookFactory implements Factory{
    @Override
    public Book create() {
        return new Book();
    }
}
