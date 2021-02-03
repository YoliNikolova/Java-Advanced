import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEvery3Line_05 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Asus\\Desktop\\JavaFile-Demo\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream in = null;

        PrintWriter writer = new PrintWriter("zadacha5.txt");

        try{
            in = new FileInputStream(path);
            Scanner readFile = new Scanner(in);
            int count = 1;
            while(readFile.hasNext()){
               String line = readFile.nextLine();
               if(count%3==0){
                   writer.println(line);
               }
               count++;
            }
        }catch(IOException ex){
            System.out.println("File not found");
        }
        in.close();
        writer.close();
    }
}
