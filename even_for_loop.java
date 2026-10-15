import java.util.Scanner;
public class even_for_loop {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int even =0;
        int odd =0;
        System.out.println("The number is: " + n);
        for(int i=0;i<=n;i++){
            if(i%2==0){
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println("The sum even: " + even+" The sum odd: " + odd);
        sc.close();
    }
}
