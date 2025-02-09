public class cwh_33_varargs {
    // static int sum (int ...arr){
    //     //Available as int[] arr
    //     int result = 0;
    //     for (int a : arr){
    //         result += a;
    //     }
    //     return result;
    // }
    // public static void main(String[] args) {
    //     // System.out.println("WELCOME TO VARARGS TUTORIAL...");
    //     // System.out.println("SUM OF NOTHING IS :" + sum());
    //     // System.out.println("the some of numbers : " + sum(2,4,5,7,78,76,89,5,67,23,90));
    //     // System.out.println("the sum " + sum(34,45,56,67));
    //     System.out.println(sum(56,66,81,85,52,53));
    // }



    //2nd method
    
    
    static int sum (int x,int ...arr){
        //Available as int[] arr
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        // in ths method you cannot run  empty array.
       System.out.println("WELCOME TO VARARGS TUTORIAL...");
       System.out.println(sum(1,2,3,4,5,6));
    }
}
