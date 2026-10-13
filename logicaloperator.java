public class logicaloperator {
    public static void main(String[] args) {
        int age = 19;
        boolean check = age == 18 && age < 20;
        System.out.println("Eligible: " + check);
        boolean check1 = age == 18 || age < 20;
        System.out.println("Eligible: " + check1);
        boolean check2 = !(age == 18);
        System.out.println("Eligible: " + check2);
    }
}
