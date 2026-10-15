import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i!=0;i/=10){
            rev=rev*10+i%10;
        }
        if(rev==n){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
        sc.close();
    }
}
