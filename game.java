import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        System.out.println();
    System.out.println("WELCOME TO ROCK,PAPER,SCISSORS GAME ");
    Scanner input = new Scanner(System.in);
    System.out.println("CHOOSE YOURS : Rock(0),Paper(1),Scissors(2),");
    int user = input.nextInt();
    int computer = (int)(Math.random()*3);
    System.out.print("The computer choose :");
    switch (computer) {
        case 0:
        System.out.println("Rock");
            break;
        case 1:
        System.out.println("paper");
            break;
        case 2:
        System.out.println("Scissors");
            break;
    }
    System.out.print("You choose :");
    switch (user) {
        case 0:
        System.out.println("Rock");
            break;
        case 1:
        System.out.println("Paper");
            break;
        case 2:
        System.out.println("Scissors");
            break;
    }
    if (computer==user){
        System.out.println("It is Draw");
         }
    else{
        boolean win = (user==2&&computer==0)
                    ||(user==1&&computer==0)
                    ||(user==0&&computer==2);
        if (win){
            System.out.println("You won !! ");
            System.out.println("Congratulations ...");
            System.out.println();
        }
        else {
            System.out.println("You lose !!");
            System.out.println("Try again...");
            System.out.println();
             }
        }

    }

}
