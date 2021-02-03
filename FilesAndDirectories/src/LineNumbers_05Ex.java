import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05Ex {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");

        List<String> lines = Files.readAllLines(path);

        int row = 1;
        PrintWriter writer = new PrintWriter("output.txt");
        for (String line : lines) {
            writer.println(row + ". " + line);
            row++;
        }
        writer.close();
    }
}
