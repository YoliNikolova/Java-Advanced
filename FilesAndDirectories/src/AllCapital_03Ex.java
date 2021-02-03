import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapital_03Ex {
    public static void main(String[] args) throws IOException {

        Path input = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
      //  Path output = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        PrintWriter writer = new PrintWriter("output.txt");
        List<String> lines = Files.readAllLines(input);
        lines.forEach(line-> writer.println(line.toUpperCase()));
        writer.close();
    }
}
