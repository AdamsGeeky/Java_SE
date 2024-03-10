import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int rem, sum = 0, n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
