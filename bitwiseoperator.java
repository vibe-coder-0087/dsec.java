public class bitwiseoperator {
    public static void main(String args[])
    {
        int a=10;
        int b=11;
        int c;
        System.out.println("BITWISE OPERATOR");
        c=(a&b);
        System.out.println("a & b: " + c);
        c=(a|b);
        System.out.println("a | b: " + c);
        c=(a^b);
        System.out.println("a ^ b: " + c);
    }
}
