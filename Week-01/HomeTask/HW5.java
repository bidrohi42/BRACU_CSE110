import java.lang.Math;

public class HW5 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt(a * a + b * b);

        System.out.println("sin(A) = " + a / c);
        System.out.println("sin(B) = " + b / c);
        System.out.println("cos(A) = " + b / c);
        System.out.println("cos(b) = " + a / c);
    }
}
