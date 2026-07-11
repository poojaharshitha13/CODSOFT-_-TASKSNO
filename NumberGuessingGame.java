import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 7;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " tries to guess it.\n");

        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1;
            int attemptsLeft = maxAttempts;
            boolean guessed = false;

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                attemptsLeft--;

                if (guess == secretNumber) {
                    System.out.println("Correct! You found the number!");
                    guessed = true;
                    score += attemptsLeft + 1; 
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("Too high. Attempts left: " + attemptsLeft);
                }
            }

            if (!guessed) {
                System.out.println("You ran out of tries. The number was " + secretNumber);
            }

            System.out.println("Your score so far: " + score);

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String answer = input.next().toLowerCase();
            playAgain = answer.equals("yes") || answer.equals("y");
        }

        System.out.println("\nGame over! Your final score: " + score);
        input.close();
    }
}