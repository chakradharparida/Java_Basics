
//   Excercise 6 : You have to create a calculater with following operations:
//   1. Addition
//   2. Substraction
//   3. Multiplication
//   4. Division 
  
//   Which through following exception :
//   1. Invalid input exception ex :   8 & 9
//   2. Cannot devided by 0 exceptiona
//   3. Max input Exception if any of the inputs is gretter then 100000
//   4. Max multiplier Reached Exception- Don't allow any Multiplication input to br greater then 7000
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

// Main class to test the Calculator
public class cwh_87_Excercise_06 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example test cases
        double[][] testCases = {
            {5000, 4000, 1},    // Addition
            {100000, 1, 2},     // Subtraction
            {7001, 500, 3},     // Multiplication (should trigger MaxMultiplierReachedException)
            {50000, 0, 4}       // Division (should trigger DivisionByZeroException)
        };

        for (double[] testCase : testCases) {
            double a = testCase[0];
            double b = testCase[1];
            int operation = (int) testCase[2];

            try {
                switch (operation) {
                    case 1:
                        System.out.println("Adding " + a + " + " + b + " = " + calculator.add(a, b));
                        break;
                    case 2:
                        System.out.println("Subtracting " + a + " - " + b + " = " + calculator.subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Multiplying " + a + " * " + b + " = " + calculator.multiply(a, b));
                        break;
                    case 4:
                        System.out.println("Dividing " + a + " / " + b + " = " + calculator.divide(a, b));
                        break;
                    default:
                        System.out.println("Invalid operation selected.");
                        break;
                }
            } catch (InvalidInputException | DivisionByZeroException | MaxInputException | MaxMultiplierReachedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
