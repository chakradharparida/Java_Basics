class Base{
    int x;
    public void getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("i am getting x now");
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
public Derived extends Base{
    int y;
    public void gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());
    }
}
