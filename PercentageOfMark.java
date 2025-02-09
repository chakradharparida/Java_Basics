import java.util.*;
public class PercentageOfMark {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // It ask to the user the sum of the full marks of each subject :
    System.out.println("ENTER YOUR TOTAL MSRKS");
    Float total=sc.nextFloat();
    //float total=300;
    // these are ask the user the marks got in each sub. one by one :
    System.out.println("Marks in ODIA");
    float a=sc.nextFloat();
    System.out.println("Marks in ENGLISH");
    float b=sc.nextFloat();
    System.out.println("Marks in PHYSICS");
    float c=sc.nextFloat();
    System.out.println("Marks in CHEMISTRY");
    float d=sc.nextFloat();
    System.out.println("Marks in MATH");
    float e=sc.nextFloat();
    System.out.println("Marks in BIOLOGY");
    float f=sc.nextFloat();
    // The total mark got the user :
    float sum = a+b+c+d+e+f;
    System.out.println("YOUR TOTAL MARK IS"+sum);
    // It will calculate the percentage of the total marke which is got by the user :
    float percentage=((sum*100)/total);
    System.out.println("percentage :"+percentage+"%");
    //Thank you @ MR_CHANDU
    }
}