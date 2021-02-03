import java.io.*;
import java.util.Scanner;

public class ExtractInteger_04 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Asus\\Desktop\\JavaFile-Demo\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        PrintWriter writer = new PrintWriter("integer-output.txt");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
               int number = scanner.nextInt();
               writer.println(number);
            }
            scanner.next();
        }
        writer.flush();
        writer.close();
    }
}
