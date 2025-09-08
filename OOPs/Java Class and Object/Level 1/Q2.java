public class Q2 {
    double r;

    Q2(double r) {
        this.r = r;
    }

    public void areaCircle() {
        System.out.println((Math.PI * r * r));
    }

    public void circumferenceCircle() {
        System.out.println((2 * Math.PI * r));
    }

    public static void main(String[] args) {
        Q2 circle = new Q2(2.5);
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}