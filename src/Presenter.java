

interface Presenter {
    void loadEntries();
    void addEntry(String date, String content);
    void searchEntries(String keyword, String date);
    void sortEntries();
    void saveToFile(String fileName);
    void loadFromFile(String fileName);
}