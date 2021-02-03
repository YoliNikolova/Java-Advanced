import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

       String  currentAddress = "";

        String input = scanner.nextLine();
        while(!input.equals("Home")){
            if(input.equals("forward")){
                if(forwardStack.isEmpty()){
                    System.out.println("no next URLs");
                }else{
                    System.out.println(forwardStack.peek());
                    backStack.push(forwardStack.pop());
                }
            }else if(input.equals("back")){
                if(backStack.size()<=1){
                    System.out.println("no previous URLs");
                }else{
                    forwardStack.push(backStack.pop());
                    System.out.println(backStack.peek());
                }
            }else{
                forwardStack.clear();
                currentAddress=input;
                System.out.println(currentAddress);
                backStack.push(currentAddress);
            }
            input=scanner.nextLine();
        }
    }
}
