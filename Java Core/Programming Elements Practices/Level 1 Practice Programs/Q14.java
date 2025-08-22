import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in feet is " + distanceInFeet +
                           " which is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
