import java.util.Scanner;
import java.util.Random;
public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;


        Random random = new Random();


        for (int i = 0; i < numFlips; i++) {
            // Generate a random number between 0 and 1
            double randomValue = random.nextDouble();

            // Check if it's heads or tails
            if (randomValue < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        // Calculate the percentage of heads and tails
        double headsPercentage = ((double) headsCount / numFlips) * 100;
        double tailsPercentage = ((double) tailsCount / numFlips) * 100;


        System.out.println("Number of flips: " + numFlips);
        System.out.println("Heads: " + headsCount + " (" + String.format("%.2f", headsPercentage) + "%)");
        System.out.println("Tails: " + tailsCount + " (" + String.format("%.2f", tailsPercentage) + "%)");

        scanner.close();
    }
}


