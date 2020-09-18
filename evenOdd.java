import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = scan.nextInt();
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
