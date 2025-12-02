public class Task06b {
    public static void main(String [] args) {
        int a = 77;
        int b = 33;
        System.out.println("Before swapping: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        // Using simple arithmatic here due to course restriction
        // But it can also be achieved by xor'ing the values
        a += b;
        b = a - b;
        a -= b;

        System.out.println("After swapping: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
