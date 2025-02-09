class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 54;
        while (true) {
            System.out.println("I am a thread," + this.getName());
        }
    }
}

public class cwh_74_threads_priority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Chandan0");
        MyThr1 t2 = new MyThr1("Chandan1");
        MyThr1 t3 = new MyThr1("Chandan2");
        MyThr1 t4 = new MyThr1("Chandan3");
        MyThr1 t5 = new MyThr1("Chandan4");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

