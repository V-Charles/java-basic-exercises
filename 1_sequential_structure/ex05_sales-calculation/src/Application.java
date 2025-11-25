import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the part number 1:");
        int code1 = sc.nextInt();
        System.out.println("Please specify the quantity of pieces:");
        int amount1 = sc.nextInt();
        System.out.println("Please provide the unit price of the part 1:");
        double unitPrice1 = sc.nextDouble();

        System.out.println("-----------------------------------");

        System.out.println("Please provide the part number 2:");
        int code2 = sc.nextInt();
        System.out.println("Please specify the quantity of pieces:");
        int amount2 = sc.nextInt();
        System.out.println("Please provide the unit price of the part 2:");
        double unitPrice2 = sc.nextDouble();
        System.out.println("-----------------------------------");

        double total = (unitPrice1 * amount1) + (unitPrice2 * amount2);

        System.out.printf("Amount to pay: R$ %.2f%n", total);

        sc.close();
    }
}
