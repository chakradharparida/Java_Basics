class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 54;
        // while(true){
        //     System.out.println("I am a thread.");
        }
    }

public class cwh_73_Thread_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Chandan");
        MyThr t2 = new MyThr("Chandan1");
        t1.start(); 
        t2.start(); 
        System.out.println("The id of the thread t is " + t1.getId());   
        System.out.println("The name of the thread t is " + t1.getName());   
        System.out.println("The id of the thread t is " + t2.getId());      
        System.out.println("The name of the thread t is " + t2.getName());   
    }
}
