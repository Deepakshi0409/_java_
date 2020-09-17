import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {

        double a, b, output;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        a = scanner.nextDouble();

        System.out.print("Enter second number : ");
        b = scanner.nextDouble();

        System.out.print("Enter an expression (+, -, *, /) : ");
        operator = scanner.next().charAt(0);


        switch (operator) {
            case '+':
                output = a + b;
                break;

            case '-':
                output = a - b;
                break;

            case '*':
                output = a * b;
                break;

            case '/':
                output = a / b;
                break;


            default:
                System.out.println("You have entered wrong operator");
                return;
        }


        System.out.println(a + " " + operator + " " + b + ": " + output);
    }
}
