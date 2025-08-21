import java.util.Scanner;

public class Q1_Self_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Principal = sc.nextInt();
        int Rate = sc.nextInt();
        int Time = sc.nextInt();

        double Simple_Interest = (Principal * Rate * Time) / 100;
        System.out.println(Simple_Interest);
    }
}
