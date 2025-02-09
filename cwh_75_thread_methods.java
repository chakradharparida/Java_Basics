class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i=0;
        while (i<100000) {
            System.out.println("I am a thread :");
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }  
    }
}
class MyThr2 extends Thread {
    public MyThr2(String name) {
        super(name);
    } 

    public void run() {
        int i = 0;
        while (i<100000) {
            System.out.println("yessssss,I am a thread :");
            i++;
        } 
    }
}

public class cwh_75_thread_methods {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1 ("Chandan0");
        MyThr2 t2 = new MyThr2 ("Chandan1");

        t1.start();
        
        t2.start();
        
    }
}