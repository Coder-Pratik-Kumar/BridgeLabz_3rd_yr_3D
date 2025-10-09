package Arrays.Level_1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is positive and even.");
                } else {
                    System.out.println(num[i] + " is positive and odd.");
                }
            } else if (num[i] < 0) {
                System.out.println(num[i] + " is negative.");
            } else {
                System.out.println(num[i] + " is zero.");
            }
        }

        if (num[0] == num[num.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (num[0] > num[num.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
    }
}
