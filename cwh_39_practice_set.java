class Employee{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n) {
        return n ;
    }
    
}
 class cellphone{
    public void ringig(){
        System.out. println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("calling chandu...");
    }
    
 }
  class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 5*side;
    }
  }

 
  // PROBLEM 05  

  
  class Tommy{
    public void hit(){
    System.out.println("Hitting the enemy..");
    }
    public void run(){
    System.out.println("Running from the enemy..");
    }
    public void fire(){
    System.out.println("Firing on the enemy..");
    }
  }
public class cwh_39_practice_set {
    public static void main(String[] args) {
        // Employee chandan = new Employee();
        // chandan.setName ("mr.chandan");
        // chandan.Salary = 233;
        // System.out.println(chandan.getSalary());
        // System.out.println(chandan.getName());

        // // PRONLEM 2

        // cellphone asus = new cellphone();
        // asus.callfriend();
        // asus.vibrating();
        // asus.ringig();

        //PRBLEM 3

        //  Square sq = new Square();
        //  sq.side = 4;
        //  System.out.println(sq.area());
        //  System.out.println(sq.perimeter());

          // PROBLEM  05

        //   Tommy player1= new Tommy();
        //   player1.fire();
        //   player1.run();
        //   player1.hit();

          


    }
}
