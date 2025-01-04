import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n=sc.nextInt();

        int firstTerm=0, secondTerm=1;

        System.out.println("Fibonacci Series:");
        for(int i=1;i<=n;i++){
            System.out.print(firstTerm+ " ");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }

        sc.close();
    }
}
