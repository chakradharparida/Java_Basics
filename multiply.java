import java.util.Scanner;

public class multiply {
    public static void main(String []args){
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no 1  : ");
        int a = sc.nextInt();
        System.out.print("Enter the number2  : ");
        int b = sc.nextInt();
        int multiplication = a*b;
        System.out.print("The Multiplication of thees number is :");
        System.out.print(multiplication);
    }
}
