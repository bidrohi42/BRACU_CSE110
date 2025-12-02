public class Task06a {
    public static void main(String [] args) {
        int a = 77;
        int b = 33;
        System.out.println("Before swapping: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
