import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide the employee number:");
        int employeeNumber = sc.nextInt();
        System.out.println("Please state the number of hours worked in minutes:");
        int hoursWorked = sc.nextInt();
        System.out.println("Please state the hourly rate:");
        double hourlyWage = sc.nextDouble();

        double salary = hourlyWage * hoursWorked;

        System.out.println("Result:");
        System.out.println("Number: " + employeeNumber);
        System.out.printf("Salary: U$ %.2f%n", salary);

        sc.close();
    }
}
