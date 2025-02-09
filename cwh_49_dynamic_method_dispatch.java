class phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("My name is JAVA");
    }
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void on(){
        System.out.println("Turning on smart phone...");
    }
}
public class cwh_49_dynamic_method_dispatch {
     public static void main(String[] args) {
        phone obj = new smartphone();
        obj.greet();
        obj.on();
     }
}
