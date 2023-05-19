package laba3;

import basa.Movie;

public class MovieFactory implements Factory{

    @Override
    public Movie create() {
        return new Movie();
    }
}
/*
public class MediaItemFactory { // мне кажется данная реализация лучше
    public MediaItem createMediaItem(String type) {
        if (type.equalsIgnoreCase("book")) {
            return new Book();
        } else if (type.equalsIgnoreCase("film")) {
            return new Film();
        } else {
            throw new IllegalArgumentException("Invalid media item type.");
        }
    }
}
*/
