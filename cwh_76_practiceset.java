class practice13 extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
                // TODO: handle exception
            }
            System.out.println("Good Morning..");
        }
    }
}
class practice13b extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
                // TODO: handle exception
            }
            System.out.println("Welcome..");
        }
    }
}
public class cwh_76_practiceset {
    public static void main(String[] args) {
        practice13 p1=new practice13();
        practice13b p2=new practice13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p1.start();
        p2.start();
    }
}
