package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Please provide your salary: ");
        double salary = sc.nextDouble();

        if (salary <= 2000.00) {
            System.out.println("Tax exempt");
        }
        else if (salary <= 3000.00) {
            double tax = (salary - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", tax);
        }
        else if (salary <= 4500.00) {
            double tax = 80.00 + (salary - 3000.00) * 0.18;
            System.out.printf("R$ %.2f%n", tax);
        }
        else {
            double tax = 80.00 + 270.00 + (salary - 4500.00) * 0.28;
            System.out.printf("R$ %.2f%n", tax);
        }

        sc.close();
    }
}
