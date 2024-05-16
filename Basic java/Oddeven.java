
public class Oddeven {

    public static void main(String[] args) {
        int number = 29;

        if ((number & 1) == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
