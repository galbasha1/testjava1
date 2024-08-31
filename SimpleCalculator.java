import java.util.Scanner;

/*I took a CS1400 equivalent at MT SAC a few years ago so I no longer have access to most of my old projects, so 
 *     test message       */

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char operator;
        Double num1, num2, result;
        boolean calculation1 = true;

        while (calculation1) {
            System.out.println("Select an operator to begin: +, -, *, /, or type 'x' to exit");
            operator = input.next().charAt(0);

            if (operator == 'x' || operator == 'X') {
                calculation1 = false;
                System.out.println("Calculator closing.");
                break;
            }

            System.out.println("Please select the first number:");
            num1 = input.nextDouble();

            System.out.println("Please select the second number:");
            num2 = input.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("You cannot divide by 0, try another value.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator! Please try again.");
                    break;
            }
        }

        input.close();
    }
}
