import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 integer values:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int difference = num1 * num2 - num3 * num4;

        System.out.println("Result of the difference between the values: " + difference);

        sc.close();
    }
}