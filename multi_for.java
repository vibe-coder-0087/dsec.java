import java.util.Scanner;
public class multi_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Multiply the number");
        for (int i=1;i<=5;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        scanner.close();
    }
}
