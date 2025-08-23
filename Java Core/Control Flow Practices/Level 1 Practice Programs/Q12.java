import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;

            int i = 1, sumWhile = 0;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);

            if (sumFormula == sumWhile) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations do not match.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
