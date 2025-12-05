public class HW3 {
    public static void main(String [] args) {
        int id = 1000055640;

        int last = id % 10;
        id = id / 10;
        int last2 = id % 10;

        System.out.println(last + " and " + last2);

    }
}
