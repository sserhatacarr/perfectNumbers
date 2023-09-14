import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        int n, i = 1, result = 0;
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Check if the number is a perfect number
        while ((n/2)+1 > i) {
            if (n % i == 0) {
                result += i;
            }
            i++;
        }

        // Display the result
        if (result == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
