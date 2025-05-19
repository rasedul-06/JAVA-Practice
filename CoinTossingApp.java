package CoinToss;

import java.util.Random;
import java.util.Scanner;

public class CoinTossingApp {

    // Enum for Coin Side
    public enum Coin {
        HEADS, TAILS
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0, tailsCount = 0;

        while (true) {
            System.out.println("Coin Tossing Simulation");
            System.out.println("1. Toss Coin");
            System.out.println("2. Show Results");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Coin result = flip();
                    if (result == Coin.HEADS) {
                        headsCount++;
                    } else {
                        tailsCount++;
                    }
                    System.out.println("You tossed: " + result);
                    break;
                case 2:
                    System.out.println("Heads: " + headsCount);
                    System.out.println("Tails: " + tailsCount);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    // Method to simulate a coin flip
    public static Coin flip() {
        Random random = new Random();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}