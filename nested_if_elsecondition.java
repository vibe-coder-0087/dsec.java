import java.util.Scanner;

public class nested_if_elsecondition {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int currentYear = Sc.nextInt();
        System.out.println("The current year is: " + currentYear);
        if (currentYear % 400 == 0) {
            System.out.println(currentYear + " is a leap year.");
        } else if (currentYear % 100 == 0) {
            System.out.println(currentYear + " is not a leap year.");
        } else if (currentYear % 4 == 0) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }
        Sc.close();
    }
}
