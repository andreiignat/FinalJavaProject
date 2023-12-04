
import java.util.*;

interface Model {
    List<Entry> getEntries();
    void addEntry(Entry entry);
    List<Entry> searchEntries(String keyword, String date);
    void sortEntries();
    void saveToFile(String fileName);
    void loadFromFile(String fileName);
}