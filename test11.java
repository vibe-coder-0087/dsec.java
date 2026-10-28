
public class test11{

    private static boolean string;

    public static void main(String[] args) {
        String s = "hello";
        char arr[] = s.toCharArray();
        string = Arrays.toString(arr);
        System.out.println(string);
        arr[arr.length - 1] = 'b';
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        s = new String(arr);
        System.out.println(s);
    }
}
