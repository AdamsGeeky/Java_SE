import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num, tms;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the number to be multiplied by: ");
        num = scanner.nextInt();

        for (tms = 1; tms <= 10; tms++) {
            System.out.printf("\n \t \t %d  X  %d = %d\n", num, tms, num * tms);
        }
    }
}
