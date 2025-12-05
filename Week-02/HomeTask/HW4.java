import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of 3 sides of triangles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("This is a Equilateral triangle");
        }

        else if ((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) {
            System.out.println("This is a Isosceles triangle");
        }

        else {
            System.out.println("This is a Scalene triangle");
        }

        sc.close();
    }
}
