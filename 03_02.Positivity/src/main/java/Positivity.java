
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scan.nextLine());
        if (number < 1) {
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is positive.");
        }

    }
}
