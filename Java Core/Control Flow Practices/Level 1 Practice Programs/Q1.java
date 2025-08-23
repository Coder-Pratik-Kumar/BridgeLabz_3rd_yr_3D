import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Is the number " + num + " divisible by 5? ");
        check(num);
    }

    public static void check(int num) {
        if(num%5==0){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
