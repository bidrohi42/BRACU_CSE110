import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount the customer needs to pay(Taka)");
        int a = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int b = sc.nextInt();

        if (b > a) {
            int c = b - a;
            System.out.println("The returned amount is " + c + " taka");
            System.out.println("100 taka note: " + c / 100);
            c = c % 100;
            System.out.println("50 taka note: " + c / 50);
            c %= 50;
            System.out.println("20 taka note: " + c / 20);
            c %= 20;
            System.out.println("10 taka note: " + c / 10);
            c %= 10;
            System.out.println("5 taka coin: " + c / 5);
            c %= 5;
            System.out.println("2 taka coin: " + c / 2);
            c %= 2;
            System.out.println("1 taka coin: " + c / 1);
        }

        else if (a == b) {
            System.out.println("The returned amount is 0");
        }

        else {
            System.out.println("Please pay " + (a - b) + " taka more");
        }

        sc.close();
    }
}
