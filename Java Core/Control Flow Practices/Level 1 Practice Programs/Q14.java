import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + fact);
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }
    }
}
