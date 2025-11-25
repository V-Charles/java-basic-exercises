import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the product code.");
        int code = sc.nextInt();
        System.out.println("Please specify the quantity of the product.");
        int quantity = sc.nextInt();

        String error = "";
        String product = "";
        double price = 0.0;
        switch (code){
            case 1:
                product = "Hot Dog";
                price = 4.0;
                break;
            case 2:
                product = "X-Salad";
                price = 4.5;
                break;
            case 3:
                product = "X-Bacon";
                price = 5.0;
                break;
            case 4:
                product = "Plain toast";
                price = 2.0;
                break;
            case 5:
                product = "Soda";
                price = 1.5;
                break;
            default:
                error = "Invalid code entered, please try again.";
                break;
        }

        if (error.isEmpty()) {
            double total = price * quantity;
            System.out.println("------------------------");
            System.out.println("Electronic Invoice:");
            System.out.println("------------------------");
            System.out.println("Product: " + product);
            System.out.printf("Unit price: U$ %.2f%n", price);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Total order: U$ %.2f%n", total);
            System.out.println("------------------------");
        } else {
            System.out.println(error);
        }

        sc.close();
    }
}
