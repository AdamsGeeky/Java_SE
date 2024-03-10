import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        float X, r1, r2, a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = scanner.nextFloat();
        System.out.print("Enter b: ");
        b = scanner.nextFloat();
        System.out.print("Enter c: ");
        c = scanner.nextFloat();

        X = b * b - 4 * a * c;
        r1 = (-b + Math.sqrt(X)) / (2 * a);
        r2 = (-b - Math.sqrt(X)) / (2 * a);

        if (X > 0)
            System.out.println("\nRoots are unequal ....");
        else if (X < 0)
            System.out.println("\nRoots are imaginary ....");
        else
            System.out.println("\nRoots are equal ....");

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
    }
}
