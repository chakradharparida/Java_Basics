public class cwh_84_Throw_and_Throws {
     // Static method to perform division
        public static int divide(int a, int b) throws ArithmeticException {
            int result = a / b;  // This line may throw an ArithmeticException
            return result;
        }
    
        public static void main(String[] args) {
            try {
                // Attempt to divide by zero, which will throw an exception
                int c = divide(6, 4);  // Corrected method name and made it static
                System.out.println(c);
            } catch (ArithmeticException e) {
                // Handle the exception
                System.out.println("Exception Occurred: Division by zero is not allowed.");
            }
        }
    }
