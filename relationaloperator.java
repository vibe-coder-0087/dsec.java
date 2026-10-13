public class relationaloperator {
    public static void main(String args[])
    {
        int a=10;
        int b=11;
        int c;
        boolean result;
        System.out.println("RELATIONAL OPERATOR");
        result = a < b;
        System.out.println("a < b: " + result);
        result = a > b;
        System.out.println("a > b: " + result);
        result = a <= b;
        System.out.println("a <= b: " + result);
        result = a >= b;
        System.out.println("a >= b: " + result);
        result=a==b;
        System.out.println("a == b: " + result);
        result=a!=b;
        System.out.println("a != b: " + result);
        c=a%b;
        result=c>=b;
        System.out.println("c >= b: " + result); 
    }
}
