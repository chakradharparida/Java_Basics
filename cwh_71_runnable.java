class MyThreadRunnable1 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
        System.out.println("I am a thread 1 not thread 1");
    }     
}
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
        System.out.println("I am a thread 2 not thread 2");
    }
}
}
public class cwh_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        
        gun1.start();
        gun2.start();
    }
}
