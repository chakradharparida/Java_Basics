interface Bicycle{
    int a= 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum...");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa...");
    }
    
}
public class cwh_55_interfaces2 {
    public static void main(String[] args) {
        AvonCycle cycleChandu = new AvonCycle();
        cycleChandu.applyBrake(1);
        //You can create properties in interface
        //System.out.println(cycleChandu.a);
        //You cannot modefy the properties in interface as they are final
        //cycleChandu.a=454;
        //System.out.println(cycleChandu.a);
        cycleChandu.blowHornk3g();
        cycleChandu.blowHornmhn();;
    }
}
