public class Q6 {
    public static void main(String[] args) {
        int fees = 125000;
        int disPercent = 10;
        int discount = (fees * disPercent) / 100;
        int discountPrice=fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountPrice);
    }
}
