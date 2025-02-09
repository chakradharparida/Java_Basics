public class cwh_80_try {
     public static void main(String[] args) {
        int a=6000;
        int b=0;
        //Without try
        // int c=a/b;
        //     System.out.println("The result is :"+c);   //(This is an error  )
        // With try
        try{
            int c=a/b;
            System.out.println("The result is :"+c);
        }
        catch(Exception e){
            System.out.println("We are faild to devide,\n Reason:");
            System.out.println(e);
        }
        System.out.println("End of the program.");
     }
}
