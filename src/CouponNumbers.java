import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    //Function to generate a random number within a range
    public static int generateRandomNumber(int max){
        Random random= new Random();
        return random.nextInt(max)+1; //Random number between 1 and max inclusively

    }

    //Function to calculate total random numbers needed to generate all distinct coupons
    public static int countRandomNumbersForDistinctCoupons(int n){
        HashSet<Integer> distinctCoupons= new HashSet<>();
        int totalRandomNumbers=0;

        while(distinctCoupons.size()<n){
            int randomNumber= generateRandomNumber(n);
            totalRandomNumbers++;
            distinctCoupons.add(randomNumber); //add to the set (duplicates ignored)

        }
        return totalRandomNumbers;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of distinct coupon numbers: ");
        int n=sc.nextInt();

        //Calculate total random numbers needed
        int totalRandomNumbers= countRandomNumbersForDistinctCoupons(n);

        System.out.println("Total random numbers needed to collect all distinct coupons: "+ totalRandomNumbers);
        sc.close();
    }
}
