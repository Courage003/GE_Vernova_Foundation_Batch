import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Prime Number: ");
        int n=sc.nextInt();

        //Handle edge cases
        if(n<=1){
            System.out.println(n+ " is not a Prime Number.");

        }
        else{
            boolean isPrime =true;
            //check for factors other than 1 and itself
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(n + " is a Prime Number.");
            }
            else{
                System.out.println(n+ " is not a Prime Number.");
            }
        }
        sc.close();
    }
}
