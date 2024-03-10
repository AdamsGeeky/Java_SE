import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        int a, b, tmp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n \t\t\t Let's swap the values of variables \n");
        System.out.print("Enter the value of A and the value of B: \n");
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Swapping
        tmp = a;
        a = b;
        b = tmp;

        System.out.println("Now the value of A: " + a + " and value of B: " + b + " \u0007\u0007");
    }
}
