import java.util.Scanner;

public class ConsoleNoteApp {
    public static void main(String[] args) {

        Model model = new DiaryModel();
        View view = new DiaryView();
        Presenter presenter = new DiaryPresenter(model, view);

        // ¬вод не с консоли
//        presenter.addEntry("2023-12-01", "This is an entry for December 1st.");
//        presenter.addEntry("2023-12-02", "This is another entry for December 2nd.");
//        presenter.loadEntries();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter date (MM/dd/yyyy) or 'exit' to quit:");
            String dateInput = scanner.nextLine();

            if (dateInput.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter content:");
            String content = scanner.nextLine();

            presenter.addEntry(dateInput, content);
        }
        presenter.sortEntries();
        presenter.loadEntries();



        presenter.saveToFile("dairy_entries.ser");
        presenter.loadFromFile("dairy_entries.ser");
        presenter.loadEntries();
    }
}