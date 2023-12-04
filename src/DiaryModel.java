import java.io.*;
import java.util.*;

class DiaryModel implements Model {
    private List<Entry> entries;

    public DiaryModel() {
        this.entries = new ArrayList<>();
    }

    @Override
    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    @Override
    public List<Entry> searchEntries(String keyword, String date) {
        List<Entry> searchResults = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getDate().equals(date) || entry.getContent().contains(keyword)) {
                searchResults.add(entry);
            }
        }
        return searchResults;
    }

    @Override
    public void sortEntries() {
        entries.sort(Comparator.comparing(Entry::getDate));
    }

    @Override
    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(entries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            entries = (List<Entry>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
