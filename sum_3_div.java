import java.util.Scanner;
public class sum_3_div {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            if(i%3==0){
                sum += i;
            }
        }
        System.out.println("Sum of multiples of 3 is: " + sum);
        sc.close();
    }
}
