
import java.util.*;
class DiaryPresenter implements Presenter {
    private Model model;
    private View view;

    public DiaryPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void loadEntries() {
        List<Entry> entries = model.getEntries();
        view.showEntries(entries);
    }

    @Override
    public void addEntry(String date, String content) {
        Entry newEntry = new DiaryEntry(date, content);
        model.addEntry(newEntry);
        view.showMessage("Entry added successfully.");
    }

    @Override
    public void searchEntries(String keyword, String date) {
        List<Entry> searchResults = model.searchEntries(keyword, date);
        view.showEntries(searchResults);
    }

    @Override
    public void sortEntries() {
        model.sortEntries();
        view.showMessage("Entries sorted by date.");
    }

    @Override
    public void saveToFile(String fileName) {
        model.saveToFile(fileName);
        view.showMessage("Entries saved to file.");


    }

    @Override
    public void loadFromFile(String fileName) {
        model.loadFromFile(fileName);
        view.showMessage("Entries loaded from file.");


    }
}