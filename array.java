public class array {
    public static void main(String[] args) {
        int mark[] = {5,10,15,20,25};
        int reverse[] = new int[mark.length];
        for(int i = 0; i < mark.length; i++) {
            reverse[i] = mark[mark.length - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
}
}
