public class operation {
    public static void main(String args[])
    {
    int a=4567;
    System.out.println("OPERATION ");
    int sum=0;
    while(a>0)
    {
        int rem=a%10;
        sum=sum+rem;
        a=a/10;
    }
    System.out.println("Sum of digits: " + sum);
}
}