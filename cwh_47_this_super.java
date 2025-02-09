class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int v){
        this.a=v;
    }
    public int returnone(){
        return 1;
    }
} 
public class cwh_47_this_super {
    public static void main(String[] args) {
    Ekclass e = new Ekclass(5); 
    System.out.println(e.getA()); 
}
}