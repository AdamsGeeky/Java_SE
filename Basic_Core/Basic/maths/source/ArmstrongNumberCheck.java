import java.util.Scanner;
/**
*  program to check Armstrong number
* Armstrong number E.g 153 their sum of cude is same as number etc   
*  Date: mar 10. 2024
*  by: ADAMU MUHAMMAD MUHAMMAD aka AdamsGeeky
*/
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int tmp, rem, sum = 0, n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = scanner.nextInt();
        tmp = n;

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }

        if (tmp == sum)
            System.out.println("Armstrong number " + sum);
        else
            System.out.println("Not an Armstrong Number " + sum);
    }
}
