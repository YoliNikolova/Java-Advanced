import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = Files.readAllLines(pathFile);
        lines.stream().map(String::toCharArray)
                .forEach(chArray -> {
                    int sum = 0;
                    for (char symbol : chArray) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                });
    }
}
