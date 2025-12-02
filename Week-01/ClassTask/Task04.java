import java.util.Scanner;

public class Task04 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            System.out.println(number%10);
            number = number / 10;
        }
        sc.close();
    }
}
