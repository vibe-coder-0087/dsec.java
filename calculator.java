import java.util.Scanner;
class calculator {
    int num1;
    int num2;

    void add(){
        System.out.println("ADDITION: " + (num1+num2));
    }
    void sub(){
        System.out.println("SUBTRACTION: " +(num1-num2));
    }
    void mul(){
        System.out.println("MULTIPLICATION: " +(num1*num2));
    }
    void div(){
        float result =(float) num1/num2;
        System.out.println("DIVISION: "+result);
    }
    public static void main(String[] args) {
        calculator c=new calculator();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        c.num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        c.num2=sc.nextInt();
        c.add();
        c.sub();
        c.mul();
        c.div();
        sc.close();
    }
}
