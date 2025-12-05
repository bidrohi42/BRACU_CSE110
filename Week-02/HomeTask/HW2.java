import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment: ");
        int payment = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 18 || payment < 10000) {
            System.out.println("Your tax amounts in 0 Tk");
        }

        else if (10000 <= payment && payment <= 20000) {
            System.out.println("Your tax amounts in " + payment * 0.05 + " Tk");
        }

        else {
            System.out.println("Your tax amounts in " + payment * 0.10 + " Tk");
        }

        sc.close();
    }
}
