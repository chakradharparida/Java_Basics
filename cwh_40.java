class myemployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    public void setId(int i){

    }
    public int getId(){
        return id;
    }
    

}
public class cwh_40 {
    public static void main(String[] args) {
       myemployee chandu=new myemployee();
    //    chandu.id=45;
    //    chandu.name="mr.chandu"; 
     chandu.setName("mr.chandu");
     System.out.println(chandu.getName());
     chandu.setId(234);
     System.out.println(chandu.getId());
    }
}
