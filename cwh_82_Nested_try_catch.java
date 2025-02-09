import java.util.Scanner;

public class cwh_82_Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            
            System.out.println("Enter the array index:");
            int ind = sc.nextInt();
            
            try {
                System.out.println("Welcome to vdo no. 82");
                try {
                    // Accessing the array element at the user-provided index
                    System.out.println("Value at index " + ind + " is: " + marks[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Handling the case when the user enters an index out of bounds
                    System.out.println("Sorry, this index does not exist!");
                    System.out.println("Exception in level 2");
                }
            } 
            catch (Exception e) {
                System.out.println("Exception in level 1");
            }
            
            sc.close(); // Closing the Scanner to prevent resource leaks
        }
        System.out.println("Thanks for using the program.");
    }
}

