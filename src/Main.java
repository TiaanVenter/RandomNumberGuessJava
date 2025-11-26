import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Random number guessing game!

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberGenerated = random.nextInt(1, 11), yourGuess = 0, guesses = 0;

        do {
            System.out.print("Please enter your guess: ");
            yourGuess = scanner.nextInt();
            guesses = guesses + 1;
        }while(yourGuess > numberGenerated || yourGuess < numberGenerated);

        System.out.println("Congrats! You guessed the right number in " + guesses + " guesses! ");

        scanner.close();
    }
}

