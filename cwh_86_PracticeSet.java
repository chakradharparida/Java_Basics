import java.util.Scanner;

public class cwh_86_PracticeSet {
    public static void main(String[] args) {
        //Problem 1
        // Syntax Error -int a =7
        int age =67;
        int YearBurn=2000-67;//Logical error
        //System.out.println(6/0);

        //Problem 02

        // try {
        //     int a = 6/0;
        // } catch (IllegalArgumentException e) {
        //     System.out.println("HaHa");
        // } catch (ArithmeticException e) {
        //     System.out.println("HeHe");
        // }

        //Problem_03
  
        boolean flag=true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.print("Enter the value of index :");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is :" +marks[index]);
                break;
            }catch (Exception e) {
                System.out.println("Invalid Index !");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }


        Problem_04

        boolean flag=true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.print("Enter the value of index :");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is :" +marks[index]);
                break;
            }catch (Exception e) {
                System.out.println("Invalid Index !");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}


