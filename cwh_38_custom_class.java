class Employee{
int id;
String Name;

public void printDetails(){
    System.out.println("My ID is" +  id);
    System.out.println("My name is" +  Name);
}
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is a custom class.");
        Employee chandan = new Employee();  //Istatiating a new Employee Object
        Employee john= new Employee();  //Istatiating a new Employee Object
        // Setting Attribute
        chandan.id= 12;
        chandan.Name=" Mr.Chandu";
        john.id= 15;
        john.Name=" Mr.john";
        //Printing Attribute
        // System.out.println(chandan.id);
        // System.out.println(chandan.Name);
        chandan.printDetails();
        john.printDetails();
        
    }
}