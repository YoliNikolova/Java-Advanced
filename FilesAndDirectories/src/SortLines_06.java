import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines_06 {
    public static void main(String[] args) {
        Path input = Paths.get("C:\\Users\\Asus\\Desktop\\JavaFile-Demo\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path output = Paths.get("C:\\Users\\Asus\\Desktop\\JavaFile-Demo\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");

        try{
            List<String> lines = Files.readAllLines(input);
            lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(output,lines);
        }catch (IOException ex){
            System.out.println("error");
        }
    }
}
