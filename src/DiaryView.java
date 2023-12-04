
import java.util.*;

class DiaryView implements View {
    @Override
    public void showEntries(List<Entry> entries) {
        for (Entry entry : entries) {
            System.out.println("Date: " + entry.getDate());
            System.out.println("Content: " + entry.getContent());
            System.out.println("-----------");
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}