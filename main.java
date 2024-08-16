
import java.util.Random;
import java.util.Scanner;

class GuessGame {

    public static  void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        boolean correct = false;
        int guess; 
        int numGuesses = 0;

        System.out.println("Guess a number between 1 and 100:");

        while(!correct) {
            guess = input.nextInt();
            numGuesses ++;

            if(guess == randomNumber) {
                System.out.println("Congratulations");
                correct = true;
            } else if(guess < randomNumber) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
        }
        input.close();

    }
}