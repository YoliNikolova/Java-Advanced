

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobots = scanner.nextLine().split(";");

        Map<String, Integer> robots = getLinkedHashMap(inputRobots);

        String[] time = scanner.nextLine().split(":");
        int hours = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);
        long totalTimeInSec = hours*3600+min*60+sec;

        ArrayDeque<String> products = new ArrayDeque<>();
        String product = scanner.nextLine();
        int[] workingTime = new int[robots.size()];

        while (!product.equals("End")) {
            products.offer(product);
            product = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            // uvelichavame tekushtoto vreme
            totalTimeInSec++;
            boolean flag = false;
            // namalqvame tek. vreme s edna sekunda
            for (int robot = 0; robot < workingTime.length; robot++) {
                if(workingTime[robot]>0){
                    --workingTime[robot];
                }
            }
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] == 0) {
                    int counter = 0;
                    for (Map.Entry<String, Integer> robot : robots.entrySet()) {
                        if (counter == i) {
                            workingTime[i] = robot.getValue();
                            long takenHours = totalTimeInSec/3600%24;
                            long minutes = totalTimeInSec%3600/60;
                                            long seconds =  totalTimeInSec %60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n",robot.getKey(), currentProduct,takenHours,minutes,seconds);
                            flag=true;
                            break;
                        }
                        counter++;
                    }
                    break;
                }
            }
            if(!flag){
                products.offer(currentProduct);
            }
        }
    }

    private static Map<String, Integer> getLinkedHashMap(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < inputRobots.length; i++) {
            String[] oneRobotInfo = inputRobots[i].split("-");
            String nameRobot = oneRobotInfo[0];
            int timeRobot = Integer.parseInt(oneRobotInfo[1]);
            robots.put(nameRobot, timeRobot);
        }
        return robots;
    }
}
