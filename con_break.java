
public class con_break {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            if (i % 2 != 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
