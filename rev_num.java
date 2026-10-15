import java.util.Scanner;
public class rev_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = 0;
        for(int i = n; i != 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }
        System.out.println("Reversed number is: " + rev);
        sc.close();
    }
}
