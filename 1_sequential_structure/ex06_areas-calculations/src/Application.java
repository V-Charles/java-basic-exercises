import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three values:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangle = a * c / 2;
        double circle = Math.PI * Math.pow(c, 2);
        double trapezoid = (a + b) * c / 2;
        double square = b * b;
        double rectangle = a * b;

        System.out.println("------------------------");
        System.out.println("Result");
        System.out.printf("Triangle: %.3f%n", triangle);
        System.out.printf("Circle: %.3f%n", circle);
        System.out.printf("Trapezoid: %.3f%n", trapezoid);
        System.out.printf("Square: %.3f%n", square);
        System.out.printf("Rectangle: %.3f%n", rectangle);

        sc.close();
    }
}
