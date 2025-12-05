import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a value for inch: ");
        int inch = sc.nextInt();

        System.out.println(inch + " inch is " + inch * 0.0254 + " meters");
        sc.close();
    }
}
