public class HW1 {
    public static void main(String[] args) {

        int minutes = 3456789;

        int years = minutes / (365 * 24 * 60);
        int days = (minutes - years * 365 * 24 * 60) / (24 * 60);

        System.out.println(minutes + " is approximately " + years + " years and " + days + " days");
    }
}
