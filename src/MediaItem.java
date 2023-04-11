public interface MediaItem {
    String getTitle();
    int getYear();
    String[] getElements();
    String getElement(int index);
    void setElement(int index, String value);
    int countCharsInElements();
}
