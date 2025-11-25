import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("Enter the radius value:");
        double radius = sc.nextDouble();
        double area = pi * (radius * radius);

        System.out.println("------------------------");
        System.out.printf("Area of the circle: %.4f%n", area);
        
        sc.close();
    }
}
