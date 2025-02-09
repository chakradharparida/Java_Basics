abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Change the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){ 
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Good morning...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class cwh_60_practiceset {
    public static void main(String[] args) {
        // FountainPen foun tainPen = new FountainPen(); // Create an instance
        // fountainPen.write();   // Call instance methods
        // fountainPen.refill();
        // fountainPen.changeNib();
        Human chandan = new Human();
        chandan.eat();
    }
}
