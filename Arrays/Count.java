package Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int findelement = s.nextInt();
        for (int i = 0; i < size; i++) {
             if (arr[i] == findelement) {
                count++;
            }
        }
        System.out.println(count);
    }
}
