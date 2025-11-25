import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integer values:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Please note that division by zero is not possible.");
        } else if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("They are multiples.");
        } else {
            System.out.println("They are not multiples.");
        }

        sc.close();
    }
}
