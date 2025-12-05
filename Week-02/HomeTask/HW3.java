import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 float numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if (a > b && a > c) {
            System.out.println("Maximum number is " + a);
        }

        else if (b > a && b > c) {
            System.out.println("Maximum number is " + b);
        }

        else {
            System.out.println("Maximum number is " + c);
        }

        if (a < b && a < c) {
            System.out.println("Minimum number is " + a);
        }

        else if (b < a && b < c) {
            System.out.println("Minimum number is " + b);
        }

        else {
            System.out.println("Minimum number is " + c);
        }

        sc.close();
    }
}
