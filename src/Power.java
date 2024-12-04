public class Power {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single command-line argument for N.");
            return;
        }

        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer value for N.");
            return;
        }

        if (N < 0 || N >= 31) {
            System.out.println("Please enter a value of N such that 0 <= N < 31.");
            return;
        }

        System.out.println("Powers of 2 from 2^0 to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (1 << i));
        }
    }
}
