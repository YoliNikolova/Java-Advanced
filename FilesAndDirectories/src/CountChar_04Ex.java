import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class CountChar_04Ex {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Asus\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;

        String vowels = "aeiou";
        String punctuation = "!,.?";

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();

        while (line != null) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                for (char symbol : word.toCharArray()) {// zashtoto polzvame forEach
                    String symbolAsString = String.valueOf(symbol);
                    if (vowels.contains(symbolAsString)) {
                        countVowels++;
                    } else if (punctuation.contains(symbolAsString)) {
                        countPunctuation++;
                    } else {
                        countConsonants++;
                    }
                }
            }
            line=reader.readLine();
        }
        reader.close();
        PrintWriter writer = new PrintWriter("outputZad4Ex.txt");
        writer.println("Vowels: " + countVowels);
        writer.println("Consonants: " + countConsonants);
        writer.println("Punctuation: " + countPunctuation);
        writer.close();
    }
}
