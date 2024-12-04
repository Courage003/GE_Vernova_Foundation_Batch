import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();


        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");
            return;
        }


        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = (year % 400 == 0);
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }


        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }


        sc.close();
    }
}
