import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rem, n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        n = scanner.nextInt();

        while (n > 0) {
            rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }

        System.out.println();
    }
}
