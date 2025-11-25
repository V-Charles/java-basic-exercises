import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the game's start time.");
        int startTime = sc.nextInt();
        System.out.println("Please inform the game's end time.");
        int endTime = sc.nextInt();

        int duration = 0;
        if (startTime < endTime) {
            duration = endTime - startTime;
        } else if (startTime > endTime) {
            duration = 24 - startTime;
            duration += endTime;
        } else if (startTime == endTime) {
            duration = 24;
        }

        System.out.println("The game duration is: " + duration + " hours.");

        sc.close();
    }
}
