import java.util.Scanner;

// Custom exception classes
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

// Calculator class
class Calculator {
    public double add(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input should not be greater than 100000");
        }
        return a + b;
    }

    public double subtract(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input should not be greater than 100000");
        }
        return a - b;
    }

    public double multiply(double a, double b) throws MaxInputException, MaxMultiplierReachedException {
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplier should not be greater than 7000");
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input should not be greater than 100000");
        }
        return a * b;
    }

    public double divide(double a, double b) throws MaxInputException, DivisionByZeroException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input should not be greater than 100000");
        }
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Main class
public class TryCalculater {
    // Method to validate input and check for invalid characters
    public static double validateInput(String input) throws InvalidInputException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            // Taking inputs from the user
            System.out.print("Enter the first number: ");
            double a = validateInput(scanner.nextLine());

            System.out.print("Enter the second number: ");
            double b = validateInput(scanner.nextLine());

            System.out.print("Enter the operation (add, subtract, multiply, divide): ");
            String operation = scanner.nextLine().toLowerCase();

            // Performing the selected operation
            switch (operation) {
                case "add":
                    System.out.println("Result: " + calculator.add(a, b));
                    break;
                case "subtract":
                    System.out.println("Result: " + calculator.subtract(a, b));
                    break;
                case "multiply":
                    System.out.println("Result: " + calculator.multiply(a, b));
                    break;
                case "divide":
                    System.out.println("Result: " + calculator.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
                    break;
            }
        } catch (InvalidInputException | DivisionByZeroException | MaxInputException
                | MaxMultiplierReachedException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
