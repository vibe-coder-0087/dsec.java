import java.util.Scanner;

public class if_else_ifcondition {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = Sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = Sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = Sc.nextInt();
        if (a > b&& a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > c&& b > a) {
            System.out.println("b is greater than c and a");
        } else {
            System.out.println("c is greater than a and b");
        }
        Sc.close();
    }
}
