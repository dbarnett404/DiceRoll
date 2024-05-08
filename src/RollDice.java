import java.util.Scanner;

/**
 * This class represents a simple dice roll simulation.
 */
public class RollDice {

    /**
     * This method simulates a die roll.
     * @return an integer between 1 and 6 (inclusive) representing the result of the dice roll.
     */
    public static int getDiceRoll() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * The main method that drives the program.
     * It prompts the user to enter the number of dice rolls and the dice face to check.
     * It then simulates the dice rolls and counts the number of times the specified dice face appears.
     * Finally, it prints out the number of matches and the expected number of matches.
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rolls");
        int numRolls = scanner.nextInt(); // The number of dice rolls to simulate
        System.out.println("Enter dice face to check (1-6)");
        int diceFace = scanner.nextInt(); // The dice face to check for
        int matches = 0; // The number of times the specified dice face appears

        // Simulate the dice rolls and count the matches
        for (int i = 0; i < numRolls; i++) {
            if (getDiceRoll() == diceFace) {
                matches++;
            }
        }

        // Print out the results
        System.out.println("Number of dice showing: " + diceFace + " = " + matches);
        System.out.println("Expected number should be around: " + (numRolls / 6));
    }
}
