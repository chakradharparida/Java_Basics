public class cwh_85_finally_block {
    public static int devide(int a, int b) throws ArithmeticException{
        int result=a/b;
        return result;
        
    }
    
    public static void main(String[] args) {
        try{
            int c = devide(50,0);
            System.out.println(c);
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program has been executed.");
        }
        
    }
}
