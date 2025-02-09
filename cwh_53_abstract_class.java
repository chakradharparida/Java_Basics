abstract class parent2{
    public parent2(){
        System.out.println("I am a constructor of base2.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good afternoon");
    }
}
abstract class child3 extends parent2{
    public void th(){
       System.out.println("I am good"); 
    }
}
public class cwh_53_abstract_class {
    public static void main(String[] args) {
        //parent2 p = new parent2();  - error
        child2 c = new child2();    
        //child3 c3 = new child3();   - error
    }
    

}
