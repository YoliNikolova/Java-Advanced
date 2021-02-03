import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumByte_02Ex {
    public static void main(String[] args) throws IOException {

        Path pathFile = Path.of("C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        long sum =0;
        byte[] values = Files.readAllBytes(pathFile);
        for (byte value : values) {
            if(value == 10 || value==13){
                continue;
            }
            sum=sum+value;
        }
        System.out.println(sum);
    }
}
