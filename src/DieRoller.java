import java.util.Scanner;
import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        Random rand = new Random();
        int diceSum = 0;
        //initialize dice to different values
        int die1 = -1;
        int die2 = -2;
        int die3 = -3;
        boolean userDone = false;
        String userInput = "";

        System.out.println("Welcome to \"Rolling Triplets\"!");
        System.out.print("\n");

        do {
            //local
            int rollNumber = 1;

            System.out.println("Roll    Die 1    Die 2    Die 3    Sum");
            System.out.println("--------------------------------------");

            while (!(die1 == die2 && die2 == die3)) {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                diceSum = die1 + die2 + die3;

                System.out.printf("%-8d%-9d%-9d%-9d%-3d\n", rollNumber, die1, die2, die3, diceSum);
                rollNumber++;
            }

            System.out.println("\nYou rolled a triplet of " + die1 + "s, with a sum of " + diceSum + ".\n");

            //reset dice
            die1 = -1;
            die2 = -2;
            die3 = -3;

            System.out.print("Enter Q to quit, or anything else to play again: ");
            userInput = consoleIn.nextLine();
            if (userInput.equalsIgnoreCase("Q")) {
                userDone = true;
            }
        } while (!userDone);
    }
}
