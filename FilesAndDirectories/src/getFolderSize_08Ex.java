import java.io.File;
import java.nio.file.Path;

public class getFolderSize_08Ex {
    public static void main(String[] args) {

        String folderPath = "C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(folderPath); // papka(folder)

        long size = 0;
        for(File file : folder.listFiles()){
            size += file.length();
        }
        System.out.println("Folder size: " + size);
    }
}
