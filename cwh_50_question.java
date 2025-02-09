import java.util.Scanner;
import java.util.Random;

class Game {
    public int number;
    public int inputnumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);  // Generates a random number between 0 and 99
    }

    void takeUserInput() {
        System.out.println("Guess the Number:");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputnumber == number) {
            System.out.format("You guessed it right! It was %d.\nYou guessed it in %d attempts.\n", number, noOfGuesses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class cwh_50_question {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}