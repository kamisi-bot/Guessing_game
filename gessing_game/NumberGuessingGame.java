import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter the minimum range: ");
        int minRange = scanner.nextInt();

        System.out.print("Enter the maximum range: ");
        int maxRange = scanner.nextInt();

        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int numberOfGuesses = 0;

        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + numberOfGuesses + " guesses.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }
}
