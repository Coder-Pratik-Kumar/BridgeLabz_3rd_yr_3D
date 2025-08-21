import java.util.Scanner;

public class Q2_self_problems {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int Width = sc.nextInt();
        
        double Perimeter = 2 * (Length + Width);
        System.out.println(Perimeter);
    }
}
