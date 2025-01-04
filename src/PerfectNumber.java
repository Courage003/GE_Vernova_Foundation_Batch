import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Perfect Number: ");
        int n=sc.nextInt();

        //Calculate sum of divisors
        int sumOfDivisors=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sumOfDivisors+=i;
            }
        }

        //Check if number is perfect
        if(sumOfDivisors==n){
            System.out.println(n+ " is a Perfect Number.");
        }
        else{
            System.out.println(n+ " is Not a Perfect Number.");
        }

        sc.close();
    }
}
