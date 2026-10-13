public class ternaryoperator {
    public static void main(String args[])
    {
        int a=10;
        int b=11;
        int c;
        int d=450;
        int e=45;
        int f=25;
        int max=d>e?d>f?d:f>e?f:e:e>f?e:f;
        System.out.println("TERNARY OPERATOR");
        c=(a<b)?a:b;
        System.out.println("c: " + c);
        c=(a!=b)?a:b;
        System.out.println("c: " + c);
        c=(a>b)?a:b;
        System.out.println("c: " + c);
        System.out.println("max: " + max);

    }
}
