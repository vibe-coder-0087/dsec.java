import java.util.Scanner;
public class array3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int mark[]=new int[size];
        System.out.println("Enter the marks:");
        for(int i=0;i<size;i++){
            mark[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=mark[i];
        }
        System.out.println("Sum of marks: " + sum);
        sc.close();
    }
}
