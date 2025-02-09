import java.util.Scanner;

public class sum {
    public static void main(String []args){
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no 1:");
        int a = sc.nextInt();
        System.out.print("Enter the no 2:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of thees number is :");
        System.out.print(sum);
    }
}
