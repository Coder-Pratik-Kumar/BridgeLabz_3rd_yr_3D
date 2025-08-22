public class Q5 {
    public static void main(String[] args) {
        int totalpens = 14;
        int students = 3;
        int penPerStudent = totalpens / students;
        int remainingPens = totalpens % students;

        System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainingPens);

     }
}
