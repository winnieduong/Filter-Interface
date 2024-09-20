import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            displayShortWords(selectedFile);
        }
    }

    private static void displayShortWords(File file) {
        ShortWordFilter filter = new ShortWordFilter();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (filter.accept(word)) {
                    System.out.println(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
