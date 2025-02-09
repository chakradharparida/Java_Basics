import java.util.zip.Deflater;
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor with value of a  as :"+a);
    }
}
    class Derived1 extends Base1{
        Derived1(){ 
            super(0);
            System.out.println("I am a derived class constructor");
        }
        Derived1(int x,int y){
            System.out.println("i am a overloaded constructor of Derived with value of b as :"+y);
        }
    }
public class cwh_46_constructorsinheritance {
    public static void main(String[] args) {
    Base1 b=new Base1();
    Derived1 d = new Derived1();
    }
}
 