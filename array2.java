import java.util.Scanner;
public class array2 {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int mark[] = new int[size];
        System.out.println("Enter the mark");
        for (int i = 0; i < size; i++) {
            mark[i] = sc.nextInt();
        }
        System.out.println("The marks are:");
        for (int i = 0; i < size; i++) {
            System.out.print(mark[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
