import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Asus\\Desktop\\JavaFile-Demo\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream readFile = null;
        try {
            readFile = new FileInputStream(path);
            int oneByte = readFile.read();
            while (oneByte>=0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte=readFile.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(readFile!=null){
                readFile.close();
            }
        }
    }
}
