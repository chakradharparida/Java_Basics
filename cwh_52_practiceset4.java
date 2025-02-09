class Circle{
    public int radious;
    Circle(int r){
        System.out.println("I am a circle parameterize constructor");
        this.radious=r;
    }
    public double area(){
        return Math.PI*this.radious*this.radious;
    }
}
class cylinder1 extends Circle{
    cylinder1(int r,int h){
        super(r);
        System.out.println("i am cylinder1 pararameterize constructor ");
        this.height=h;
    }
    public int height;
    
    public double volume(){
        return Math.PI*this.radious*this.radious;
    }
}
public class cwh_52_practiceset4 {
    public static void main(String[] args) {
        // problem 1
        //Circle objc= new Circle(12);
        cylinder1 obj=new cylinder1(12, 10);
        
    }
}
