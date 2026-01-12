package While_loop;

import java.util.Scanner;
import java.util.Random; // Import Random class

public class Guessing_game_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("Enter a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again");
            } else if (guess > numberToGuess) { // Corrected variable name
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! You have taken -> " + attempts + " attempts.");
                break;
            }
        }
        scanner.close(); // Close the scanner
    }
}