import java.util.Scanner;

public class ex_for_loop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The number is: " + n);
        int sum = 0;
        for(int i=0;i<n;n--)
        {
            sum += n; //1+2+3+4+5=15
        }
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
