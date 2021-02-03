import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeFiles_07Ex {
    public static void main(String[] args) throws IOException {

        Path firstPath = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path secondPath = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> lineFirst = Files.readAllLines(firstPath);
        List<String> lineSecond = Files.readAllLines(secondPath);

        PrintWriter writer = new PrintWriter("merge.txt");
        //purvi nachin
        for (String line1 : lineFirst) {
            writer.println(line1);
        }
        //vtori nachin
        lineSecond.forEach(writer::println);

        writer.close();
    }
}
