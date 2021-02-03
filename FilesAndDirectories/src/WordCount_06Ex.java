import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06Ex {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // четем базата от думи и ги съхраняваме
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                map.put(word, 0);
            }
        }

        Path pathSearch = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        List<String> searchedLines = Files.readAllLines(pathSearch);
// търсим думите от базата в тескта
        for (String searchedLine : searchedLines) {
            String[] searchedWords = searchedLine.split("\\s+");
            for (String w : searchedWords) {
                if (map.containsKey(w)) {
                    int newCount = map.get(w) + 1;
                    map.put(w, newCount);
                }
            }
        }
        PrintWriter writer = new PrintWriter("output.txt");
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            writer.println(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue());
        }
        writer.close();
    }
}
