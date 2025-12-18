import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearcher {
    public static String readFileToString(String fileName) {
        StringBuilder text = new StringBuilder();
        try {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNextLine()) {
                text.append(input.nextLine()).append("\n");
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return text.toString();
    }

    public static void search (String searchString, String fileRoot) {
       for (int n = 1; n <= 3; n++) {
        String content = readFileToString(fileRoot + n + ".txt");
        int i = 0;
        int value = content.toLowerCase().indexOf(searchString.toLowerCase());
        while (value != -1){
            i++;
            System.out.println("Found occurrence " + i + " at index: " + value + " in file: " + fileRoot + n + ".txt");
            value = content.toLowerCase().indexOf(searchString.toLowerCase(), value + 1);
        }
    }
}
}