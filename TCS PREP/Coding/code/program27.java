import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Example: 1234
        int r = sc.nextInt(); // Example: 2

        int temp = n;
        int sum = 0;

        // Step 1: Sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Step 2: Repeat R times
        sum *= r;

        // Step 3: Reduce to a single digit
        while (sum >= 10) {
            int digitSum = 0;

            while (sum > 0) {
                digitSum += sum % 10;
                sum /= 10;
            }

            sum = digitSum;
        }

        System.out.println(sum);
    }
}