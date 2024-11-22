import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Get the operator (+, -, *, /) from the user
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        // Get the second number from the user
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        // Perform the calculation based on the operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of (+, -, *, /).");
        }

        // Close the scanner
        scanner.close();
    }
}
