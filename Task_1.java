// 1. Generate a random number within a specified range, such as 1 to 100.
// 2. Prompt the user to enter their guess for the generated number.
// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
// is correct, too high, or too low.
// 4. Repeat steps 2 and 3 until the user guesses the correct number.
// You can incorporate additional details as follows:
// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand=new Random();
            int rounds=0;
            int attempts=0,maxAttempts=3;
            // int score=0;
            while (true) {
                rounds++;
                System.out.println("Round " + rounds + "! I'm thinking of a number between 1 and 100.");
                System.out.println("You have 6 attempts to guess it.");
                while (attempts<maxAttempts) {
                    System.out.println("Enter your guess");
                    attempts++;
                    int guess=sc.nextInt();
                    int number=rand.nextInt(100)+1;
                    if (guess==number) {
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    }
                    else if (guess < number) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
            
            if (attempts == maxAttempts) {
                System.out.println("Game over! The number was "+ number  + ".");
            } else {
                System.out.println("You won this round!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
   }
            }
        }
}
}
    