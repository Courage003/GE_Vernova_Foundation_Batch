import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine(); // Wait for the user to press Enter
        long startTime = System.currentTimeMillis(); // Record start time

        System.out.println("Stopwatch started. Press Enter to stop...");
        scanner.nextLine(); // Wait for the user to press Enter again
        long endTime = System.currentTimeMillis(); // Record end time

        // Calculate elapsed time
        long elapsedTime = endTime - startTime;

        // Convert milliseconds to seconds
        double elapsedSeconds = elapsedTime / 1000.0;

        System.out.println("Elapsed time: " + elapsedSeconds + " seconds.");

        scanner.close();
    }
}
