public class FirstFiveEvenSum {
    public static void main(String[] args) {
        int n = 2;
        int counter = 0;
        int[] sum = new int[5];

        while (counter < 5) {
            sum[counter] += n;
            n += 2; // Increment by 2 to get the next even number
            counter++;
        }

        int totalSum = 0;
        for (int i = 0; i < 5; i++) {
            totalSum += sum[i];
        }

        System.out.println("The sum is: " + totalSum);
    }
}
