import java.lang.Math;

public class HW4 {
    public static void main(String [] args) {

        double a = 8;

        double b = 3;

        double c = a/2;

        double side = Math.sqrt(c*c + b*b);
        double circumference = side*6;
        double area = a*b + a*side;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

    }
}
