import java.util.InputMismatchException;
import java.util.Scanner;

public class cwh_83_exception_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter The 1st Number :");
            int num1=sc.nextInt();
            System.out.print("Enter The 2nd Number :");
            int num2=sc.nextInt();
            double result=num1/num2;
            System.out.println("The result of the Division is : "+result);
        } catch (ArithmeticException e) {
            System.out.println("Error : Division by zero is not llowed !");
            
        } catch(InputMismatchException e){
            System.out.println("Error : Please enter a valid Number !");
        } finally{
            sc.close();
            System.out.println("Program Execution is completed.");
        }
    }
}
